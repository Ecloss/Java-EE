package socket.manWoman;

/**
 * 孩子出生啦
 *
 * @author Ecloss
 */
public class Output implements Runnable {

    private Res4 r4;

    public Output(Res4 r4) {
        this.r4 = r4;
    }

    @Override
    public void run() {
        while (true) {
            r4.get();
        }
    }
}
