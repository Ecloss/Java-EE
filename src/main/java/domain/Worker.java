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
}
