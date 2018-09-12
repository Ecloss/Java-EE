/**
 * this的关键字
 * this可以调用本类的成员变量或成员函数
 *
 * @author 余修文
 * @date 2018/9/12 11:08
 */
class Person02 {
    private String name;
    private int age;

    Person02() {
        this.name = "baby";
    }

    private Person02(String name) {
        this.name = name;
    }

    Person02(String name, int age) {
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
        System.out.println("name = " + this.name + ", age = " + this.age);
    }

    public void method() {
        this.show();
    }

    public boolean sameAge(Person02 person) {
        return this.age == person.age;
    }
}

public class ThisFunc {

    public static void main(String[] args) {
        Person02 p1 = new Person02("Yueel", 22);
        p1.method();
        Person02 p2 = new Person02("XiaoBai", 20);
        p2.method();
        boolean isFlag = p1.sameAge(p2);
        System.out.println(p1.getName() + " and " + p2.getName() + " age name age?  " + isFlag);
    }

}
