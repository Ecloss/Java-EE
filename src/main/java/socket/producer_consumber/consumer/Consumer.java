package socket.producer_consumber.consumer;

import socket.producer_consumber.res.Res;
import socket.producer_consumber.res.Res1;

/**
 * 消费者
 *
 * @author Ecloss
 */
public class Consumer implements Runnable {

    private Res r;
    private Res1 r1;

    public Consumer(Res r) {
        this.r = r;
    }

    public Consumer(Res1 r1) {
        this.r1 = r1;
    }

    @Override
    public void run() {
        while (true) {
            //r.get();
            r1.get();
        }
    }

}
