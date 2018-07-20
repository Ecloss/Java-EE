package mode.singleton;

/**
 * 单例模式中的饿汉模式
 *
 * @author Ecloss
 */
public class HungryMode {

    private static HungryMode hungryMode = new HungryMode();

    /**
     * private私有模式的构造器
     */
    private HungryMode() {
    }

    public static HungryMode getInstance() {
        return hungryMode;
    }

}
