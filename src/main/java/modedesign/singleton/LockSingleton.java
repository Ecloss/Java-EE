package modedesign.singleton;

/**
 * 双重校验锁:给静态锁加上了volatile类型
 *
 * @author Ecloss
 */
public class LockSingleton {

    private volatile static LockSingleton lockSingleton;

    public LockSingleton() {
    }

    public static LockSingleton getLockSingleton() {
        if (lockSingleton == null) {
            synchronized (LockSingleton.class) {
                if (lockSingleton == null) {
                    lockSingleton = new LockSingleton();
                }
            }
        }
        return lockSingleton;
    }
}
