/**
 * 构造函数
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
