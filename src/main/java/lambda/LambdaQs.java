package lambda;

interface Eatable {
    void taste();
}

interface Flyable {
    void fly(String weather);
}

interface Addable {
    int add(int a, int b);
}

/**
 * Lambda表达式
 *
 * @author Ecloss
 */
public class LambdaQs {

    /**
     * 调用Eatable接口
     *
     * @param e
     */
    public void eat(Eatable e) {
        System.out.println(e);
        e.taste();
    }

    /**
     * 调用Flyable接口
     *
     * @param f
     */
    public void drive(Flyable f) {
        System.out.println("我正在驾驶：" + f);
        f.fly("[碧空如洗的晴日]");
    }

    /**
     * 调用Addable的接口
     *
     * @param add
     */
    public void test(Addable add) {
        System.out.println("5 与 3的和为：" + add.add(5, 3));
    }

    public static void main(String[] args) {
        LambdaQs lq = new LambdaQs();
        //  Lambda表达式的代码块只有一条语句，可以省略花括号
        //lq.eat(() -> System.out.println("苹果的味道不错"));
        lq.eat(new LambdaQs.test());
        //  Lambda表达式的形参列表只有一个形参，可以省略圆括号
        lq.drive(weather -> {
            System.out.println("今天天气是：" + weather);
            System.out.println("直升机飞行平稳");
        });
        //  Lambda表达式的代码块只有一条语句，可以省略花括号
        //  代码块中只有一条语句，即使该表达式需要返回值，也可以省略return
        lq.test((a,b) -> a+b);
    }

    public static class test implements Eatable {

        @Override
        public void taste() {
            System.out.println("苹果的味道不错");
        }
    }

}
