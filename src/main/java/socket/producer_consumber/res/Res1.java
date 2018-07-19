package socket.producer_consumber.res;

/**
 * 多生产者，多消费者
 *
 * @author Ecloss
 */
public class Res1 {

    /**
     * 2个问题
     * 1. 重复生产，重复消费
     * 解决：被唤醒的线程必须判断标记，使用while循环搞定
     * 2. 死锁了
     * 希望本方如果唤醒了对方线程，就可以解决了，可以使用notifyAll方法
     */

    private String name;
    private int count = 1;
    private boolean flag;

    public synchronized void set(String name) {
        while (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }//每次醒来都应该再次判断标记。所以用while，安全。
        }
        this.name = name + "--" + count;
        count++;
        System.out.println(Thread.currentThread().getName() + "...生产者.." + this.name);
        flag = true;
        this.notifyAll();//唤醒所有等待线程(包括本方线程)
    }

    public synchronized void get() {
        while (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println(Thread.currentThread().getName() + ".....消费者....." + this.name);
        flag = false;
        this.notifyAll();


    }
}
