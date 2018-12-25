package lambda;

import javax.swing.*;

/**
 * 引用类方法
 *
 * @author Ecloss
 */
public class MethodRefer {

    @FunctionalInterface
    interface Converter {
        Integer convert(String from);
    }

    @FunctionalInterface
    interface MyTest {
        String test(String a, int b, int c);
    }

    @FunctionalInterface
    interface YourTest {
        JFrame win(String title);
    }

    public static void main(String[] args) {
        //  1. Lambda的第一个方法：引用类方法
        Converter converter = from -> Integer.valueOf(from);
        Integer val = converter.convert("99");
        System.out.println(val);
        //  2. Lambda的第二个方法：引用特定对象的实例方法
        Converter converter1 = Integer::valueOf;
        //  3. 引用某类对象的实例方法
        MyTest myTest = (a, b, c) -> a.substring(b, c);
        String str = myTest.test("java, I love you", 2, 9);
        System.out.println(str);
        //  4. 引用构造器
        YourTest yt = (String a) -> new JFrame(a);
        JFrame jf = yt.win("我的窗口");
        System.out.println(jf);
        YourTest yt1 = JFrame :: new;
    }

}
