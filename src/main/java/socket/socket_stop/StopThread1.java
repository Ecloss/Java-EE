package socket.socket_stop;

/**
 * 使用interrupt（中断）方法
 *
 * @author Ecloss
 */
public class StopThread1 implements Runnable {
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + ". exeception. . " + e.toString());
                flag = true;
            }
            System.out.println(Thread.currentThread().getName() + ". . . . hello");
        }
    }
}
