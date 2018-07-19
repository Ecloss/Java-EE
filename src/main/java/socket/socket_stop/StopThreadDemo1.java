package socket.socket_stop;

/**
 * interrupt中断方法
 *
 * @author Ecloss
 */
public class StopThreadDemo1 {

    public static void main(String[] args) throws InterruptedException {
        StopThread1 st1 = new StopThread1();
        Thread t1 = new Thread(st1);
        Thread t2 = new Thread(st1);

        t1.start();
        t2.start();

        Thread.sleep(10);
        for (int i = 0; i <= 50; i++) {
            if (i == 40) {
                t1.interrupt();
                t2.interrupt();
            }
            System.out.println(Thread.currentThread().getName() + ". .12. ." + i);
        }
        System.out.println("main over");
    }

}
