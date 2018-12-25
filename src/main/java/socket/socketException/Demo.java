package socket.socketException;

/**
 * 产生锁
 *
 * @author Ecloss
 */
public class Demo implements Runnable {

    @Override
    public void run() {
        System.out.println(4 / 0);
    }
}
