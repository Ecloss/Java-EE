package socket.socket_stop;

/**
 * 停止线程方法
 *
 * @author Ecloss
 */
public class StopThread implements Runnable {

    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            System.out.println(Thread.currentThread().getName() + ". . . . .");
        }
    }

    public void setFlag() {
        this.flag = false;
    }

}
