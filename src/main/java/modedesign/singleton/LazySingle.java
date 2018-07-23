package modedesign.singleton;

/**
 * 懒汉模式（线程非安全）：在对象生成时实例化这个对象，等到调用getInstance方法时，才实例化这个对象
 *
 * @author Ecloss
 */
public class LazySingle {

    private static LazySingle lazySingle;

    private LazySingle() {
    }

    public LazySingle getInstance() {
        if (lazySingle == null) {
            lazySingle = new LazySingle();
        }
        return lazySingle;
    }
}
