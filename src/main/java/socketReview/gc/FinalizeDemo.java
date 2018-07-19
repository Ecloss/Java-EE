package socketReview.gc;

public class FinalizeDemo {

    public static void main(String[] args) {
        new Demo();
        new Demo();
        new Demo();
        System.gc();
        System.out.println("Hello Threadd");
    }

}
