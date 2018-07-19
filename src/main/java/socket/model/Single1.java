package socket.model;

/**
 * 懒汉模式：延迟加载模式。在多线程并发访问，会出现线程安全问题，
 * 但是加了同步就可以解决，无论是同步函数，还是同步代码块
 * 先创建这个对象，设置为null，然后等到要调用这个对象时才实例化这个对象
 *
 * @author Ecloss
 */
public class Single1 {
    private static Single1 s = null;

    /**
     * 构造器
     */
    private Single1() {
    }

    public static Single1 getInstance() {
        if (s == null) {
            synchronized (Single1.class) {
                if (s == null) {
                    s = new Single1();
                }
            }
        }
        return s;
    }
}


