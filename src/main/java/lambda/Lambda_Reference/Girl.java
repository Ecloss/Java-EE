package lambda.Lambda_Reference;

/**
 * @author 余修文
 * @date 2018/9/29 13:58
 */
public class Girl {

    private String name;
    private Integer age;

    public Girl() {
    }

    public Girl(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    public static int compareByAge(Girl prev, Girl after) {
        return prev.getAge().compareTo(after.getAge());
    }

    public int compareByName(Girl prev, Girl after) {
        return prev.getName().compareTo(after.getName());
    }

    public int companyByHash(Girl girl) {
        return this.hashCode() > girl.hashCode() ? 1 : 0;
    }
}

@FunctionalInterface
interface GirlFactory<Girl> {
        Girl create(String name, Integer age);  // 有参
}
