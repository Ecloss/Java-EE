package socket.socket_method;

/**
 * Join方法
 *
 * @author Ecloss
 */
public class JoinDemo {

    public static void main(String[] args) throws InterruptedException {
        Demo d = new Demo();
        Thread t0 = new Thread(d);
        Thread t1 = new Thread(d);
        t0.start();
        t1.start();
        t0.join();

        for (int i = 1; i <= 40; i++) {
            System.out.println(Thread.currentThread().getName() + ". . . . " + i);
        }

    }

}
