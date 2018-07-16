package enumeration.demo1;

public enum Gender implements GenderDescription {
    MALE, FEMALE;


    @Override
    public void info() {
        System.out.println("这是一个用于定义性别的枚举类");
    }
}
