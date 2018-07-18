package socket.lock;

/**
 * 死锁问题
 * 场景一：同步嵌套
 * 场景二：所有线程全部冻结，wait()
 * @author Ecloss
 */
public class DeadLockDemo {

    public static void main(String[] args) throws InterruptedException {
        SaleTicket t = new SaleTicket();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        Thread.sleep(10);
        t.flag = false;
        t2.start();
    }

}

class SaleTicket implements Runnable{
    private int tickets = 100;
    /**
     * 将flag设为true
     */
    boolean flag = true;
    /**
     *  将同步所需要的类设置为Object类型
     */
    Object obj = new Object();
    @Override
    public void run() {
        if (flag) {
            while (true) {
                synchronized (obj) {    //

                }
            }
        }
    }

    public synchronized  void sale( ) {
        synchronized (obj) {
            if (tickets > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                }
                System.out.println(Thread.currentThread().getName() + "...func..." + tickets--);
            }
        }
    }
}

