package socket.demo;

/**
 * 用来售票的系统
 * @author  Ecloss
 */
public class TicketDemo {

    public static void main(String[] args) {
        SaleTicket t1 = new SaleTicket();
        SaleTicket t2 = new SaleTicket();
        SaleTicket t3 = new SaleTicket();
        t1.start();
        t2.start();
        t3.start();
    }

}

class SaleTicket extends Thread{
    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + "..." + tickets--);
            }
        }
    }
}
