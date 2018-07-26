/**
 * 如何在finalize方法中复活自身
 *
 * @author Ecloss
 */
public class FinalizeTest {

    private static FinalizeTest ft = null;

    public void info() {
        System.out.println("测试资源清理的finalize方法");
    }

    public static void main(String[] args) {
        /**
         * 创建FInalizeTest对象立即进入可恢复状态
         */
        new FinalizeTest();
        //  通知系统进行资源回收
        System.gc();
        /**
         * 强制垃圾回收机制调用可恢复对象的finalize()方法
         */
        System.runFinalization();
        //  2. Runtime.getRuntime().runFinalization();
        ft.info();
    }



}
