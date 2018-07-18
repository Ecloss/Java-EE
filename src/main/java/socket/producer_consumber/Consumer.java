package socket.producer_consumber;

/**
 * 消费者
 *
 * @author Ecloss
 */
public class Consumer implements Runnable {

    private Res r;

    Consumer(Res r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.get();
        }
    }

}
