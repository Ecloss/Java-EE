/**
 * 成员变量和局部变量
 *
 * @author 余修文
 * @date 2018/9/12 10:21
 */

class Car {
    /**
     * run 数量
     * color 颜色
     */
    Integer num;
    String color;

    void run() {
        System.out.println(num + " | " + color);
    }
}

public class Variable {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.run();

        show(c1);
        show(c2);
    }

    /**
     * static是一个静态，只能在这个类中去使用
     *
     * @param c
     */
    public static void show(Car c) {
        /**
         * 直接输出会输出这个对象的存储地址
         */
        System.out.println(c);
        c.num = 4;
        c.color = "red";
        c.run();
    }

}
