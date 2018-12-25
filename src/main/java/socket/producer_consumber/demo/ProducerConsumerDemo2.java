package socket.producer_consumber.demo;

import socket.producer_consumber.consumer.Consumer2;
import socket.producer_consumber.producer.Producer2;
import socket.producer_consumber.res.Res2;

/**
 * 测试lock锁的实例
 *
 * @author Ecloss
 */
public class ProducerConsumerDemo2 {

    public static void main(String[] args) {
        Res2 r2 = new Res2();
        Producer2 pro = new Producer2(r2);
        Consumer2 con = new Consumer2(r2);

        /**
         * 消费者和生产者
         */
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
