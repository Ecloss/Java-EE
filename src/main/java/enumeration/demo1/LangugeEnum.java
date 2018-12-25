package enumeration.demo1;

/**
 * 1. java, 2.c, 3.js
 *
 * @author Ecloss
 */

public enum LangugeEnum {
    Java("java", 1),
    C("c", 2),
    JS("js", 3);

    private String languge;
    private Integer num;

    LangugeEnum(String languge, Integer num) {
        this.languge = languge;
        this.num = num;
    }

    /**
     * 重写toString方法
     */
    @Override
    public String toString() {
        return "LangugeEnum{" +
                "languge='" + languge + '\'' +
                ", num=" + num +
                '}';
    }
}
