package socket.demo;

/**
 * 单例模式
 *
 * @author 余修文
 * @date 2018/12/12 11:27
 */
public class SingleDemo01 {

    // 饿汉模式
    private static final SingleDemo01 SINGE_INSTANCE = new SingleDemo01();

    public SingleDemo01() {
    }

    public static SingleDemo01 getInstance() {
        return SINGE_INSTANCE;
    }
}
