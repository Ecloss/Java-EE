package socket.demo;

/**
 * 银行多线程解决同步
 *
 * @author 余修文
 * @date 2018/12/12 11:05
 */
public class BankDemo01 {

    public static void main(String[] args) {
        // 1. 创建任务对象
        Customer1 c1 = new Customer1();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);

        t1.start();
        t2.start();
    }

}

class Bank1 {
    private int num;
    private Object obj = new Object();

    public void add(int n) {
        synchronized (obj) {
            num += n;
            System.out.println("num = " + num);
        }
    }
}


class Customer1 implements Runnable {
    private Bank1 b = new Bank1();

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            b.add(100);
        }

    }
}