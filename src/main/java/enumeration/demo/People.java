package enumeration.demo;

/**
 * @author 余修文
 * @date 2018/9/28 15:56
 */
public enum People {

    /**
     * 男人， 女人
     */
    MAN("男人", 0),
    WOMAN("女人", 1);

    private String content;
    private Integer value;

    private People(String content, Integer value) {
        this.content = content;
        this.value = value;
    }

    public static People getByValue(Integer value) {
        People[] types = People.values();
        for (People people : types) {
            if (people.getValue().equals(value)) {
                return people;
            }
        }
        return null;
    }

    public String getContent() {
        return content;
    }

    public Integer getValue() {
        return value;
    }
}
