package mode.singleton;

/**
 * 静态内部类 实现单例模式
 *
 * @author Ecloss
 */
public class SingleStaticMode {

    /**
     * 静态内部类
     */
    private static class SingleStaticModeHolder {
        private static final SingleStaticMode SINGLE_STATIC_MODE = new SingleStaticMode();
    }

    public SingleStaticMode() {
    }

    /**
     * 静态内部获取类
     *
     * @return
     */
    public static final SingleStaticMode getInstance() {
        return SingleStaticModeHolder.SINGLE_STATIC_MODE;
    }
}
