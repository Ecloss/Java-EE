package socketReview.gc;

public class Demo {

    private int count = 0;
    private boolean flag;
    Object obj = new Object();

    public void set() {
        while (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        flag = true;
        this.notify();
    }

    public void get() {
        while (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        flag = false;
        this.notify();
    }

}
