/**
 * 普通Thread
 * 这是最常见的，创建一个Thread，然后让它咋while循环里一直运行着
 * 通过sleep方法来达到定时任务的效果，这样可以快速简单的实现
 *
 * @author 余修文
 * @date 2018/9/27 14:52
 */
public class TimeTask01 {

    public static void main(String[] args) {
        // run is a second
        final long timeInterval = 1000;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Hello !!");
                    try {
                        Thread.sleep(timeInterval);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }

}
