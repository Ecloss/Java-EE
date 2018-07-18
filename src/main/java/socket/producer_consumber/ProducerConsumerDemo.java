package socket.producer_consumber;

/**
 * 测试 生产者-消费者 的联系
 *
 * @author Ecloss
 */
public class ProducerConsumerDemo {

    public static void main(String[] args) {
        //  创建资源
        Res r = new Res();

        //  创建两个任务
        //  生产者
        Producer pro = new Producer(r);
        //  消费者
        Consumer con = new Consumer(r);

        //  开启线程
        Thread t1 = new Thread(pro);
        Thread t2 = new Thread(con);

        //  开启线程
        t1.start();
        t2.start();
    }

}
