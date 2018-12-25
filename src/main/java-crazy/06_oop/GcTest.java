/**
 * 垃圾回收
 *
 * @author Ecloss
 */
public class GcTest {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            new GcTest();
            //  如果要进行垃圾回收
            //  1. System
            //System.gc();
            //  2. Runtime
            Runtime.getRuntime().gc();
        }
    }

    //@Override
    public void finalize() {
        System.out.println("系统正在清理GcTest的资源");
    }

}
