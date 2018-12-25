package lambda.lambda_0808;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 余修文
 * @date 2018/8/8 21:27
 */
public class Test01 {
    List<Integer> list = new ArrayList<Integer>();


    @Test
    public void demo01() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for(Integer i : list) {
            System.out.println(i);
        }
    }

    // lambda表达式输出
    @Test
    public void demo02() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.forEach(integer -> System.out.println(integer));
    }

    public Integer add(Integer x, Integer y) {
        return x + y;
    }

    public static void main(String[] args) {

        Test01 test = new Test01();
        System.out.println(test.add(2, 6));
        //(int x, int y) -> x+y;
        //(x, y) -> {
        //    return x + y;
        //};
        //Runnable r1 = () -> (System.out.println("Hello Lambda!"); );

        Thread gaoDuanDaQiShangDangCi = new Thread(() -> {
            System.out.println("This is from anonymous metho(lambda exp)");
        });

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        //Object o = new Object();
        list.forEach(o -> {
            System.out.println(o);
        });

        gaoDuanDaQiShangDangCi.run();

    }

}
