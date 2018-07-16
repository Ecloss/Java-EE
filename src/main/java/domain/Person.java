package domain;

public class Person implements Comparable<Person> {

    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
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
    public int compareTo(Person o) {
        int temp = this.getAge() - o.getAge();
        return temp == 0 ? this.getName().compareTo(o.getName()) :temp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        final  int NUMBER = 31;
        return this.name.hashCode() + this.age*NUMBER;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            throw new ClassCastException("类型不匹配");
        }
        Person p = (Person)obj;
        return this.name.equals(p.name) && this.age == p.age;


    }
}
