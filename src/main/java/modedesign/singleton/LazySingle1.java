package modedesign.singleton;

/**
 * 懒汉模式，线程安全
 *
 * @author Ecloss
 */
public class LazySingle1 {

    private LazySingle1 lazySingle1;

    private LazySingle1() {
    }

    public LazySingle1 getInstance() {
        if (lazySingle1 == null) {
            synchronized (lazySingle1) {
                if (lazySingle1 == null) {
                    lazySingle1 = new LazySingle1();
                }
            }
        }
        return lazySingle1;
    }
}
