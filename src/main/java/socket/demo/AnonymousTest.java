package socket.demo;

/**
 * 匿名线程对象示例
 * @author Ecloss
 */
public class AnonymousTest {

    public static void main(String[] args) throws InterruptedException {
        new Thread() {
            @Override
            public void run() {
                for (int x = 1; x <= 50; x++) {
                    System.out.println(Thread.currentThread().getName() + "...x = " + x);
                }
            }
        }.start();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 50; i++) {
                    System.out.println(Thread.currentThread().getName() + "y = " + i);
                }
            }
        };

        Thread t = new Thread(r);
        t.start();
        t.join();

    for (int x = 1; x <= 50; x++) {
        System.out.println(Thread.currentThread().getName() + "z = " + x);
    }

    //  ---------------如果错误，错误发生在哪一行-------------------
    class Test implements Runnable {
        @Override
        public void run() {

        }

        public void run(Thread t) {

        }
    }

    //  结果是什么
    new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("runnable run");
        }
    }) {
        @Override
        public void run() {
            System.out.println("subThread run");
        }
    }.start();

    }

}
