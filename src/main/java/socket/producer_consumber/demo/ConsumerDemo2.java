package socket.producer_consumber.demo;

import socket.producer_consumber.consumer.Consumer;
import socket.producer_consumber.producer.Producer;
import socket.producer_consumber.res.Res1;

/**
 * 执行多生产者，多消费者的关系
 *
 * @author Ecloss
 */
public class ConsumerDemo2 {

    public static void main(String[] args) {
        Res1 r1 = new Res1();
        Producer pro = new Producer(r1);
        Consumer con = new Consumer(r1);

        Thread t0 = new Thread(pro);
        Thread t1 = new Thread(pro);
        Thread t2 = new Thread(con);
        Thread t3 = new Thread(con);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }

}
