/**
 * 单例设计模式
 *
 * @author 余修文
 * @date 2018/9/12 11:34
 */

/**
 * 饿汉单例模式
 */
class Single {
    private static final Single s = new Single();

    /**
     * 私有化构造函数， 防止其他程序调用该类对象
     */
    private Single() {
    }

    /**
     * 对外提供一个可控的方法返回对象
     */
    public static Single getInstance() {
        return s;
    }
}

/**
 * 懒汉单例模式
 */
class Single01 {
    private static Single01 s = null;

    private Single01() {
    }

    public static Single01 getInstance() {
        if (s == null) {
            s = new Single01();
        }
        return s;
    }
}

public class Singleton {

    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        System.out.println(s1 == s2);

        SuperMan man1 = SuperMan.getInstance();
        SuperMan man2 = SuperMan.getInstance();
        man2.setName("英雄");

        System.out.println("man1.name = " + man1.getName());
        System.out.println("man2.name = " + man2.getName());
    }

}

class SuperMan {
    private String name;
    private Integer age;
    private static SuperMan man = new SuperMan("KeLaKe");

    public Integer add(Integer age) {
        return age+10;
    }

    public Integer add(Integer age, String name) {
        return age+15;
    }

    private SuperMan(String name) {
        this.name = name;
    }

    public static SuperMan getInstance() {
        return man;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}