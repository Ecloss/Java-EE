package socket.socket_method;

/**
 * join方法
 *
 * @author Ecloss
 */
public class Demo implements Runnable {

    @Override
    public void run() {
        for (int x = 1; x <= 40; x++) {
            System.out.println(Thread.currentThread().getName() + ". . . . " + x);
        }
    }
}
