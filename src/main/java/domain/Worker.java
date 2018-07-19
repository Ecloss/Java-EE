package domain;

public class Worker extends Person {

    public Worker() {
        super();
    }

    public Worker(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Worker [name=" + getName() + ". age=" + getAge() + "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
