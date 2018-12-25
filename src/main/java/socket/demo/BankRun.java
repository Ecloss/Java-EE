package socket.demo;

public class BankRun implements Runnable {
    long mintime;

    public BankRun(long mintime) {
        this.mintime = mintime;
    }
    int num = 0;
    @Override
    public void run() {
        num += 100;
        System.out.println(num);
    }
}
