package socket.socket_stop;

/**
 * 执行线程停止的方法
 *
 * @author Ecloss
 */
public class StopThreadDemo {

    public static void main(String[] args) {
        StopThread st1 = new StopThread();
        Thread t1 = new Thread(st1);
        Thread t2 = new Thread(st1);

        t1.start();
        t2.start();

        int num = 1;
        for (; ; ) {
            if (++num == 50) {
                st1.setFlag();
            }
            System.out.println(Thread.currentThread().getName() + ". . .123321 . . " + num);
        }
    }

}
