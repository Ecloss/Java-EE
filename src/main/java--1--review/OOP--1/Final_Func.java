/**
 * final关键字
 * 1.final修饰符：可以修饰类，修饰方法，修饰变量。
 * 2.final修饰的类不可以被继承。
 * 3.final修饰的方法不可以被覆盖。(private修饰的方法也不可以被覆盖)
 * 4.final修饰的变量是一个常量，只能赋值一次。
 *
 * @author 余修文
 * @date 2018/9/12 13:36
 */
/*final*/ class Fu {
    /* final */void show() {
        System.out.println("Fu");
    }
}

class Zi extends Fu {
    public static final int NUM = 4;
    static final int x = 7;

    @Override
    void show() {
        final double PI = 3.14;
        //PI = 2; PI会报错
        System.out.println(PI);
    }
}

public class Final_Func {
}

/**
 * 饿汉模式可以用final关键字
 */
class Single02 {
    private static final Single02 SINGLE_INSTANCE = new Single02();

    private Single02() {
    }

    public static Single02 getInstance() {
        return SINGLE_INSTANCE;
    }
}

class Single03 {
    private static Single03 SINGLE_INSTANCE = new Single03();

    private Single03() {
    }

    public static Single03 getInstance( ) {
        if(SINGLE_INSTANCE == null) {
            SINGLE_INSTANCE = new Single03();
        }
        return SINGLE_INSTANCE;
    }

}


