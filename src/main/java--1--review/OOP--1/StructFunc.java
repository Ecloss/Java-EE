/**
 * 构造函数
 * 对象初始化时，会有一个默认的无参构造器，但是在新造构造器后，默认的构造器就被覆盖了
 * 如果把构造函数变成私有化，那么就无法创建此对象，只能通过单例模式来构造
 *
 * @author 余修文
 * @date 2018/9/12 10:50
 */
class Person01 {
    private String name;
    private int age;

    /**
     * 无参构造函数，初始化时为baby
     */
    Person01() {
        name = "baby";
        return;
    }

    /**
     * 带姓名的构造函数
     *
     * @param name
     */
    Person01(String name) {
        this.name = name;
    }

    Person01(String name, int age) {
        if (age < 0) {
            return;
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("name = " + name + ", age = " + age);
    }
}


public class StructFunc {

    public static void main(String[] args) {
        Person01 person = new Person01();
        person.show();
        person.setName("Bob");
        person.setAge(20);
        person.show();
        Person01 person01 = new Person01("Yueel", 20);
        person01.show();
    }

}

/**
 * 饿汉模式
 */
class Single06 {
    private static final Single06 SINGLE_INSTANCE = new Single06();

    private Single06() {

    }

    public static Single06 getSingleInstance() {
        return SINGLE_INSTANCE;
    }
}

/**
 * 懒汉模式
 */
class Single07 {
    private static Single07 SINGLE_INSTANCE = null;

    private Single07() {

    }

    /**
     * 静态变量可以被对象调用，也可以被类名调用。
     * @return
     */
    public static Single07 getSingleInstance() {
        if (SINGLE_INSTANCE == null) {
            SINGLE_INSTANCE = new Single07();
        }
        return SINGLE_INSTANCE;
    }
}
