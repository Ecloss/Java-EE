package lambda.lambda_0808;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 余修文
 * @date 2018/8/8 22:48
 */
public class RunnableTest01 {

    public static void main(String[] args) {

        // 1.1 用匿名内部类实现Thread  --  继承
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world1111");
            }
        }).start();

        // 1.2 用Lambda 实现Thread
        new Thread( () -> System.out.println("Hello world!--Lambda") ).start();

        // 2.1 使用匿名内部类  --  实现
        Runnable rece1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 实现接口");
            }
        };
        rece1.run();

        // 2.2 Lambda实现Thread
        Runnable rece2 = () -> System.out.println("Lambda 实现Runnable");
        rece2.run();

        System.out.println("--------------------");
        String[ ] players = {"XiaoBai", "Yueel", "Ecloss", "Yufang", "Xiuwen"};

        // 1.1 使用匿名内部类根据 name 排序players
        // 人生三大困惑：1. 欲望  2.情绪 3.习性
        // 人生学习的三种境界：琢磨， 揣摩， 着魔
        // 王阳明写书法时，写了半天不见进步，于是，每落笔时在心中思考数十回
        // 对人心的把握。每次打仗都提现思考无数次：从知道行，从行道合，从合到一
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.compareTo(o2));
            }
        });
        for (String s : players) {
            System.out.println(s);
        }

    }

}
