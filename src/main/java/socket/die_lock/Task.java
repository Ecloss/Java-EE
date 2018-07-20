package socket.die_lock;

/**
 * 死锁的线程实现
 *
 * @author Ecloss
 */
public class Task implements Runnable {
    private boolean flag;

    public Task(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            while (true) {
                synchronized (MyLock.LOCKA) {
                    System.out.println("---if---LOCKA---");
                    synchronized (MyLock.LOCKB) {
                        System.out.println("---if---LOCKB---");
                    }
                }
            }
        } else {
            while (true) {
                synchronized (MyLock.LOCKB) {
                    System.out.println("---else---LOCKB---");
                    synchronized (MyLock.LOCKA) {
                        System.out.println("---else---LOCKA---");
                    }
                }
            }
        }
    }
}
