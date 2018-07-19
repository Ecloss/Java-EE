package socket.producer_consumber.producer;

import socket.producer_consumber.res.Res2;

/**
 * 生产者
 *
 * @author Ecloss
 */
public class Producer2 implements Runnable {

    private Res2 r2;

    public Producer2(Res2 r2) {
        this.r2 = r2;
    }

    @Override
    public void run() {
        while (true) {
            r2.set("糖醋排骨");
        }
    }
}
