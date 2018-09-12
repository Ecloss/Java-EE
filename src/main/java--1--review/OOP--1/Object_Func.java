import java.util.Objects;

/**
 * Object类的使用
 *
 * @author 余修文
 * @date 2018/9/12 15:14
 */

/**
 * Object类的方法：equals, hashCode, toString
 */
class Person05 extends Object {
    private Integer age;
    private String name;

    public Person05(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person05 person05 = (Person05) o;
        return Objects.equals(age, person05.age) &&
                Objects.equals(name, person05.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Person05{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Object_Func {
    public static void main(String[ ] args) {
        Person05 p1 = new Person05(20, "Xiao");
        Person05 p2 = new Person05(23, "Yueel");
        Person05 p3 = new Person05(23, "Yueel");
        System.out.println(p1);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        /**
         * equal代表它的哈希码是否相同，
         * 但是 == 代表他们所指向的地址是否相同
         */
        System.out.println(p2.equals(p3));
        System.out.println(p3 == p2);
    }
}
