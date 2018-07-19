package socket.producer_consumber.producer;

import socket.producer_consumber.res.Res;
import socket.producer_consumber.res.Res1;

/**
 * 生产者
 *
 * @author Ecloss
 */
public class Producer implements Runnable {
    private Res r;
    private Res1 r1;

    public Producer(Res r) {
        this.r = r;
    }

    public Producer(Res1 r1) {
        this.r1 = r1;
    }


    @Override
    public void run() {
        while (true) {
            //r.set("面包");
            r1.set("面包");
        }
    }
}
