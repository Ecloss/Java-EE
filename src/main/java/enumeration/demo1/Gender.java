package enumeration.demo1;

public enum Gender implements GenderDescription {
    /**
     * 男人 女人
     */
    MALE, FEMALE;


    @Override
    public void info() {
        System.out.println("这是一个用于定义性别的枚举类");
    }
}
