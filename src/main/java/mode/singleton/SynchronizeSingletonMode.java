package mode.singleton;

/**
 * 双重检验锁单例模式
 *
 * @author Ecloss
 */
public class SynchronizeSingletonMode {

    private volatile static SynchronizeSingletonMode singletonMode;

    private SynchronizeSingletonMode() {
    }

    /**
     * 双重校验锁方法
     * 1.先判断模式是否为空
     * 2.同步锁
     * 3.再次校验是否为空
     *
     * @return
     */
    public static SynchronizeSingletonMode getSingletonMode() {
        if (singletonMode == null) {
            synchronized (SynchronizeSingletonMode.class) {
                if (singletonMode == null) {
                    singletonMode = new SynchronizeSingletonMode();
                }
            }
        }
        return singletonMode;
    }
}
