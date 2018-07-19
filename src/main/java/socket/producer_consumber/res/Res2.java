package socket.producer_consumber.res;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock锁同步
 *
 * @author Ecloss
 */
public class Res2 {

    private String name;
    private int count = 1;
    private boolean flag;

    /**
     * 创建一个锁对象
     */
    private Lock lock = new ReentrantLock();

    /**
     * 通过已有的锁获取两组监视器，一组监视生产者，一组监视消费者
     */
    private Condition proCon = lock.newCondition();
    private Condition conCon = lock.newCondition();

    public void set(String name) {
        lock.lock();
        try {
            while (flag) {
                /**
                 *  await()是lock锁中，wait阻塞状态的方法
                 */
                try {
                    proCon.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.name = name + "--" + count;
            count++;
            System.out.println(Thread.currentThread().getName() + "....生产者5.0..." + this.name);
            flag = true;
            /**
             *  生产完毕，应该唤醒一个消费者来消费
             */
            conCon.signal();
        } finally {
            lock.unlock();
        }
    }

    public void get() {
        lock.lock();
        try {
            while (!flag) {
                try {
                    conCon.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "...消费者5.0..." + this.name);
            flag = false;
            /**
             *  消费完毕，唤醒一个生产者生产
             */
            proCon.signal();
        } finally {
            lock.unlock();
        }
    }

}
