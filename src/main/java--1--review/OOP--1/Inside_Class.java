/**
 * 内部类：将一个类定义到另一个类的内部，
 * 需求：A类需要访问B类的成员，那么不需要去定义一个B类对象，
 * 可以把A类写在B类中
 * 规则：内部类可以直接访问外部类，但是外部类访问内部类时需要定义这个类的对象
 * 通常内部类会被私有化，封装，因为内部类不允许其他程序直接访问
 *
 * @author 余修文
 * @date 2018/9/13 9:49
 */
class Outer {
    private static int num = 4;

    class Inner {
        /**
         * 非静态内部类只能允许定义静态常量，不能访问静态方法
         */
        static final int count = 5;

        void show() {
            System.out.println(num);
        }
    }

    static class Inner2 {
        void show2() {
            System.out.println("show2..." + num);
        }

        static void show3() {
            System.out.println("show3..." + num);
        }
    }

    public void method() {
        Inner in = new Inner();
        in.show();
    }
}

public class Inside_Class {

    public static void main(String[] args) {
        Outer out = new Outer();
        out.method();

        /**
         * 非静态内部类，非私有的内部类访问方式
         */
        Outer.Inner in = new Outer().new Inner();
        in.show();

        /**
         * 静态，非私有内部类
         */
        Outer.Inner2 in1 = new Outer.Inner2();
        in1.show2();

        Outer.Inner2.show3();
    }

}
