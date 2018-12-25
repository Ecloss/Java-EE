package socket.die_lock;

/**
 * 用来产生死锁的条件
 *
 * @author Ecloss
 */
public class MyLock {

    public static final Object LOCKA = new Object();
    public static final Object LOCKB = new Object();

}
