package socket.test;

import org.junit.Test;
import socket.demo.BankRun;
import socket.demo.PrimeRun;

/**
 * 用于测试多线程
 *
 * @author
 */
public class DemoTest {

    @Test
    public void test01() {
        //  创建这个县城
        PrimeRun p = new PrimeRun(143);
        //  并且启动
        new Thread(p).start();
        //  synichronized
        synchronized (p) {
            new Thread(p).start();
        }
    }

    @Test
    public void test02() {
        BankRun br1 = new BankRun(143);
        BankRun br2 = new BankRun(143);

        //synchronized (br1, br2) {
        //    for (int i = 0; i < 3; i++) {
        //        new Thread(br1).start();
        //        new Thread(br2).start();
        //    }
        //}
        //synchronized (br2) {
        //    for (int i = 0; i < 3; i++) {
        //        new Thread(br2).start();
        //    }
        //}

    }

}

/**
 * 第一种方法实现线程
 *
 * @author
 */
class BasThread extends Thread {
    long mintime;

    public BasThread(long mintime) {
        this.mintime = mintime;
    }

    @Override
    public void run() {
        //  要执行的代码块
    }
}

/**
 * 利用接口实现多线程
 *
 * @author
 */
class RunAble implements Runnable {
    long mintime;

    public RunAble(long mintime) {
        this.mintime = mintime;
    }

    @Override
    public void run() {
        //  要实现的代码块
    }
}