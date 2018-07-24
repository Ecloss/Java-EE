package lambda.test;

/**
 * @author Ecloss
 */
public class LambdaTest {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
        //  Runnable 接口中只包含一个无参数的方法
        //  Lambda 表达式代表的匿名方法实现了Runnable接口中唯一的，无参数的方法
        //  下面Lambda
        Runnable r = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println();
            }
        };
    }
}
