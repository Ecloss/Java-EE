package socket.model;

import java.util.concurrent.locks.Lock;

/**
 * 单例模式加载模式，并且多线程安全，解决效率问题
 * @author Ecloss
 */
public class Single2 {

    private static final Single2 s1 = null;
    private Single2(){};
    public static Single2 getInstance() {
        if (s1 == null) {
            try {
                if(s1 == null)  {
                    //s1 = new Single2();
                }
            } finally {

            }
        }
        return s1;
    }

}
