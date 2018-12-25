package socket.manWoman;

/**
 * 生孩子啦
 *
 * @author Ecloss
 */
public class Input implements Runnable {

    private Res4 r4;
    private Integer i = 0;

    public Input(Res4 r4) {
        this.r4 = r4;
    }

    @Override
    public void run() {
        while (true) {
            if (i == 0) {
                r4.set("Ecloss", "man");
            } else {
                r4.set("Yueel", "woman");
            }
            i = (i + 1) % 2;
        }
    }
}
