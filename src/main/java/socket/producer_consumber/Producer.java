package socket.producer_consumber;

/**
 * 生产者
 * @author Ecloss
 */
public class Producer implements Runnable{
    private Res r;
    Producer(Res r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.set("面包");
        }
    }
}
