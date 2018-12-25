package socket.manWoman;

public class Test04 {

    public static void main(String[] args) {
        Res4 r4 = new Res4();
        Input in = new Input(r4);
        Output out = new Output(r4);

        Thread t0 = new Thread(in);
        Thread t1 = new Thread(out);

        t0.start();
        t1.start();
    }

}
