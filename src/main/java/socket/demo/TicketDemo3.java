package socket.demo;


/**
 * @author Ecloss
 */
class SaleTicket1 implements Runnable {
    private int tickets = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "..." + tickets--);
                }
            }
        }
    }
}

public class TicketDemo3 {
    public static void main(String[] args) {
        SaleTicket1 t = new SaleTicket1();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
