package socket.demo;

/**
 * 用银行的例子，来展示同步函数
 * @author Ecloss
 */
public class BankDemo {

    public static void main(String[] args) {
        Customer c = new Customer();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }

}

class Bank{
    private int sum;
    public synchronized void add(int n) {
        sum += n;
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("sum = " + sum);
    }
}

class Customer implements Runnable{
    private Bank b = new Bank();

    @Override
    public void run() {
        for (int x = 0; x < 3; x++) {
            b.add(100);
        }
    }
}
