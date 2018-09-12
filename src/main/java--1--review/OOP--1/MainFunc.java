/**
 * Main函数解析
 *
 * @author 余修文
 * @date 2018/9/12 10:43
 */
class Demo {
    int x = 6;

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.x = 8;
        show(demo);
        System.out.println("x = " + demo.x);
    }

    public static void show(Demo demo) {
        demo.x = 7;
    }
}

public class MainFunc {

    public static void main(String[] args) {
        int x = 4;
        show(x);
        System.out.println("x = " + x);
    }

    public static void show(int x) {
        x = 5;
    }

}
