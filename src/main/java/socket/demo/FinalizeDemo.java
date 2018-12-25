package socket.demo;

public class FinalizeDemo {

    public static void main(String[] args) {
        new Demo1();
        new Demo1();
        new Demo1();
        System.gc();    //启动垃圾回收器。垃圾回收线程是后台线程，随着其他线程的结束而自动结束
        System.out.println("Hello Threads");
    }

}

class Demo1{
    /**
     * 定义垃圾回收方法
     */
    @Override
    public void finalize() {
        System.out.println("demo ok");
    }
}
