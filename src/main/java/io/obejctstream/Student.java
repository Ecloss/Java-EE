package io.obejctstream;

import java.io.Serializable;

/**
 * @author 余修文
 * @date 2018/7/29 15:09
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 2625448595481309975L;
    private String name;
    //  transient没有被序列化
    private transient Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
