package mode.singleton;

/**
 * 懒汉模式(线程安全)
 * 因为在获取对象时候，加了同步synchroized
 *
 * @author Ecloss
 */
public class LazyMode {

    private static LazyMode lazyMode = null;

    /**
     * 构造器
     */
    private LazyMode() {
    }

    /**
     * getInstance
     */
    public static synchronized LazyMode getInstance() {
        if (lazyMode == null) {
            lazyMode = new LazyMode();
        }
        return lazyMode;
    }

}
