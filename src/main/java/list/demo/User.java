package list.demo;

import java.io.Serializable;

/**
 * 测试用例
 *
 * @author 余修文
 * @date 2019/1/9 16:31
 */
public class User implements Serializable {
    private static final long serialVersionUID = -7294941326444478560L;

    private Integer ID;

    private String name;

    private Integer age;

    public User() {
    }

    public User(Integer ID, String name, Integer age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
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
