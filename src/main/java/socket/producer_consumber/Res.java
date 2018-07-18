package socket.producer_consumber;


/**
 * 生产者和消费者线程，描述资源
 *
 * @author Ecloss
 */
public class Res {

    private String name;
    private int count = 0;
    private boolean flag;

    /**
     * 提供一个给商品赋值的方法
     *
     * @param name
     */
    public synchronized void set(String name) {
        if (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        this.name = name + "--" + count;
        System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);
        //  生产完毕，将标记改为true
        flag = true;
        //  唤醒消费者
        this.notify();
    }

    /**
     * 提供一个获取商品的方法
     */
    public synchronized void get() {
        if (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        this.name = name + "--" + count;
        System.out.println(Thread.currentThread().getName() + "....消费者...." + this.name);
        //  将标记改为false
        flag = false;
        //  唤醒生产者
        this.notify();
    }

}
