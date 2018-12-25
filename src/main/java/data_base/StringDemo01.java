package data_base;

import org.junit.Test;

<<<<<<< HEAD
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> d5b4887d236de5e8d04de6a8b009ec7c82f6bdf1

/**
 * @author 余修文
 * @date 2018/11/12 21:56
 */
public class StringDemo01 {

    /**
     * 几个常用的数据类型：
     * 1. 整数用int
     * 2. 小数用double
     * 3. 大写字母和小写字母之间差了 32 位
     */

    @Test
    public void demo01() {
        String str = "Hello ";
        str = str + "World";
        str += "！！！";
        System.out.println(str);
    }

    /**
     * 字符串的 +   和  数字的 “+”  一起使用
     */
    @Test
    public void demo02() {
        int numA = 100;
        int numB = 99;
        String str = "加法计算：";
        String str1 = str + numA + numB;
        System.out.println(str1);
    }

    /**
     * 运算符
     * 1. 三目运算符
     * 2. 位运算符
     * 3. 四则运算符
     * 4. 逻辑运算符
     */

    /**
     * 三目运算符
     */
    @Test
    public void demo03() {
        int numA = 10;
        int numB = 20;
        int numC = Integer.max(10, 20);
        int numD = numA > numB ? numA : numB;
        int numE = Math.max(numA, numB);
        System.out.println(numC);
        System.out.println(numD);
        System.out.println(numE);

        int[] a;
        String[] strs;
        Integer[] init;
        String[] strs1 = new String[]{"1", "2"};
        Integer[] integers = new Integer[1];
        int[] b = new int[10];
        int[] c = new int[10];
    }

    @Test
    public void demo04() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (Integer integer : list) {
            integer++;
        }
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
<<<<<<< HEAD

    }

    @Test
    public void demo05() {
        Integer a = null;
        final Integer count = 1;
        System.out.println(count.equals(a));
    }

    @Test
    public  void demo06() {
        BigDecimal num1 = new BigDecimal(5555);
        BigDecimal div = new BigDecimal(100);
        BigDecimal num2 = num1.divide(div);
        System.out.println(num2);

    }

    @Test
    public void demo07() {
        String str = UUID.randomUUID().toString();
        System.out.println(str +"\n");
        System.out.println(str.substring(0, 8) + str.substring(9, 13) + str.substring(19, 23) + str.substring(24));

=======
>>>>>>> d5b4887d236de5e8d04de6a8b009ec7c82f6bdf1
    }


}
