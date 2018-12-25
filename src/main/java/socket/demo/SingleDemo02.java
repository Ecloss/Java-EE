package socket.demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 单例模式之懒汉模式
 *
 * @author 余修文
 * @date 2018/12/12 11:29
 */
public class SingleDemo02 {

    private static SingleDemo02 s2 = null;

    public SingleDemo02() {
    }

    public static SingleDemo02 getInstance() {
        if (s2 == null) {
            synchronized (SingleDemo02.class) {
                if (s2 == null) {
                    s2 = new SingleDemo02();
                }
            }
        }
        return s2;
    }
}
/**
 * 单例模式延迟加载模式，并且多线程安全，解决效率问题
 */
class SingleDemo03 {
    private static SingleDemo03 s = null;
    private Lock lock = new ReentrantLock();
    private SingleDemo03() {}
    public static SingleDemo03 getInstance() {
        if (s == null) {
            try {
                if (s == null) {
                    s = new SingleDemo03();
                }
            } finally {

            }
        }
        return s;
    }
}
