package socket.die_lock;

/**
 * Test线程
 *
 * @author Ecloss
 */
public class DeadLockTest {

    public static void main(String[] args) {
        Task t1 = new Task(true);
        Task t2 = new Task(false);

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);

        th1.start();
        th2.start();

        String say = "hello";
        int flag = 0;
        if (flag == 0) {
            System.out.println(say);
        }

    }

}
