package socket.manWoman;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产男女
 */
public class Res4 {

    private String name;
    private String sex;
    private boolean flag;
    private Lock lock = new ReentrantLock();
    private Condition con = lock.newCondition();

    public void set(String name, String sex) {
        lock.lock();
        try {
            while (flag) {
                try {
                    con.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.name = name;
            this.sex = sex;
            flag = true;
            con.signal();
        } finally {
            lock.unlock();
        }
    }

    public void get() {
        lock.lock();
        try {
            while (!flag) {
                try {
                    con.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(this.name + ". . . ." + this.sex);
            flag = false;
            con.signal();
        } finally {
            lock.unlock();
        }
    }

}
