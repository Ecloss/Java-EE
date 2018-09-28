package lambda.lambda_0808;

import enumeration.demo.People;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 余修文
 * @date 2018/8/8 22:48
 */
public class RunnableTest01 {

    @Test
    public void demo01() {
        // 使用匿名内部类的方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行一个多线程");
            }
        }).start();
    }

    @Test
    public void demo02() {
        new Thread(() -> System.out.println("Hello world--Lambda")).start();
    }

    @Test
    public void demo03() {
        Runnable rab = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 实现接口");
            }
        };
        rab.run();
    }

    @Test
    public void demo04() {
        Runnable runa = () -> System.out.println("Lambda实现Runnable");
        runa.run();
    }

    @Test
    public void demo05() {
        People[] peoples = People.values();

    }

    public static void main(String[] args) {

        // 1.1 用匿名内部类实现Thread  --  继承
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world1111");
            }
        }).start();

        // 1.2 用Lambda 实现Thread
        new Thread(() -> System.out.println("Hello world!--Lambda")).start();

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
        String[] players = {"XiaoBai", "Yueel", "Ecloss", "Yufang", "Xiuwen"};

        // 1.1 使用匿名内部类根据 name 排序players
        // 人生三大困惑：1. 欲望  2.情绪 3.习性
        // 人生学习的三种境界：琢磨， 揣摩， 着魔
        // 王阳明写书法时，写了半天不见进步，于是，每落笔时在心中思考数十回
        // 对人心的把握。每次打仗都提现思考无数次：从知道行，从行道合，从合到一
        // 事多巧，心茫茫然~
        // 学贵专，学贵精，学贵正
        // 事人多巧，心茫茫然
        // 能力和眼光
        // 坚实的基础，切实的手段，落实的执行
        // 沉默是险：1.学习的沉默， 2.狡猾的沉默，3.沉默的贼，4.
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
