/**
 * 封装
 * /**
 * 封装的好处
 * 1. 提高安全性。不允许直接访问细节，并通过公共的方式访问，可以实现可控。getXXX和setXXX方法来调用
 * 2. 提高易用性。不需要知道细节，使用起来比较简单。
 * 3. 提高复用性。
 * 4. 隔离了细节实现的变化。
 *
 * @author 余修文
 * @date 2018/9/12 10:32
 */
class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 130) {
            throw new RuntimeException(age + ", 数值是错误的");
        } else {
            this.age = age;
        }
    }

    /**
     * 输出年龄
     */
    void speak() {
        System.out.println("age = " + age);
    }
}

public class Package {
    /**
     * main的存在是，该类是否需要独立运行，如果不需要，主函数是不需要定义的
     * @param args
     */
    public static void main(String[ ] args) {
        Person person = new Person();
        /**
         * Exception in thread "main" java.lang.RuntimeException: 140, 数值是错误的
         */
        //person.setAge(140);
        person.setAge(56);
        person.speak();
    }

}
