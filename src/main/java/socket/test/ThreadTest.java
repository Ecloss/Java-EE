package socket.test;

class Bank {
    private int sum;
    private Object obj = new Object();

    public void add(int n) {
        synchronized (obj) {
            sum = sum + n;
            System.out.println("sum = " + sum);
        }
    }
}

class Customer implements Runnable {
    private Bank b = new Bank();

    @Override
    public void run() {
        for (int x = 0; x < 3; x++) {
            b.add(100);
        }
    }
}

/**
 * @author Ecloss
 */
public class ThreadTest {

    public static void main(String[] args) {
        //  1.创建任务对象
        Customer c = new Customer();

        //  2. 创建线程对象
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);

        //  3. 开启线程
        t1.start();
        t2.start();
    }

}
