package socket.model;

/**
 * 单例模式
 * 饿汉模式：等饿了才去调用
 *
 * @author Ecloss
 */
public class Single {
    private static final Single SINGLE_INSTANCE = new Single();

    private Single() {
    }

    public static Single getInstance() {
        //  这里如果有判断语句
        return SINGLE_INSTANCE;
    }
}
