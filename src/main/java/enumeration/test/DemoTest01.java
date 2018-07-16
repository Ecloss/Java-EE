package enumeration.test;

import enumeration.demo1.WeekEnum;
import enumeration.demo1.WeekEnum02;
import enumeration.demo1.WeenEnum;
import org.junit.jupiter.api.Test;

public class DemoTest01 {

    @Test
    public void test01() {
        WeenEnum str = WeenEnum.THURSDAY;
        System.out.println(str);
    }

    /**
     * 1.int compareTo(E o)： A.compateTo(E o)该方法用于与制定枚举对象比较顺序，
     * 同一个枚举实例只能与相同类型的枚举实例比较。
     * A位于o之后：如果该枚举对象位于指定枚举对象之后，则返回正整数；
     * A位于o之前：反之返回负整数；
     * 否则返回零；
     */
    @Test
    public void test02() {
        //  星期五在 周六之前 ： 返回-1
        System.out.println(WeekEnum.FRIDAY.compareTo(WeekEnum.SATURDAY));
        //  周五在    周四之后：  返回+1
        System.out.println(WeekEnum.FRIDAY.compareTo(WeekEnum.MONDAY));
        //
        System.out.println(WeekEnum.FRIDAY.compareTo(WeekEnum.FRIDAY));
    }

    /**
     *  String name();  返回此枚举实例的名称，即枚举值；
     */
    /**
     *  static values();    返回一个包含全部枚举值的数组，可以用来遍历所有枚举值
     */
    @Test
    public void test03( ){
        for (WeekEnum we : WeekEnum.values()){
            System.out.println(we);
        }
    }

    /**
     *  toString();方法
     */
    @Test
    public void test05( ){
        for (WeekEnum we : WeekEnum.values()){
            System.out.println(we);
        }
    }

    /**
     *  WeekEnum02的方法
     */
    @Test
    public void test08( ) {
        for (WeekEnum02 we2 : WeekEnum02.values()) {
            System.out.println(we2.getContent() + "  " + we2.getValue());
        }
    }

    @Test
    public void test09( ) {
        for (WeekEnum02 we2 : WeekEnum02.values()) {
            System.out.println(we2.ordinal());
        }
    }

    @Test
    public void test10( ) {
        for (WeekEnum02 we2 : WeekEnum02.values()) {
            System.out.println(WeekEnum02.valueOf(WeekEnum02.class, we2.name()));
        }
    }

    /**
     *  int ordinal();  返回枚举值在枚举类中的索引值，从0开始，
     *  即枚举值在枚举声明中的顺序，这个顺序根据枚举值生命的顺序而定
     */
    @Test
    public void test04( ) {
        for (WeekEnum we :  WeekEnum.values()) {
            System.out.println(we.ordinal());
        }
    }

    /**
     *  static valueOf();
     *  返回带指定名称的指定枚举类型的枚举常量，
     *  名称必须与在此类型中声明枚举常亮所用的标识符完全匹配（不允许使用二外的空白字符），
     *  这个方法与toString相对呀，因此重写toString()方法，一定要重写valueOf()方法
     *  我们可以自己重写toString()方法，单不能自己重写valueOf()方法，当我们重写toString方法时
     *  valueOf()方法会自动重写，不用我们理会
     */
    @Test
    public static void test07( ){
        System.out.println(WeekEnum.valueOf(WeekEnum.class, "MONDAY"));
        System.out.println(WeekEnum.valueOf(WeekEnum.class, "FRIDAY"));
        System.out.println(WeekEnum.valueOf(WeekEnum.class, "SUNDAY"));

    }


}
