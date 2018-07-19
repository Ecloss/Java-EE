package socket.producer_consumber.consumer;

import socket.producer_consumber.res.Res2;

/**
 * 消费者
 *
 * @author Ecloss
 */
public class Consumer2 implements Runnable {
    private Res2 r2;

    public Consumer2(Res2 r2) {
        this.r2 = r2;
    }

    @Override
    public void run() {
        while (true) {
            r2.get();
        }
    }
}
