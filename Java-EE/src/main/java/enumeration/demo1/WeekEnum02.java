package enumeration.demo1;

public enum WeekEnum02 {
    SUNDAY("星期天", 1),
    MONDAY("星期一", 2),
    TUESDAY("星期二", 3),
    WEDNESDAY("星期三",4),
    THURESDAY("星期四", 5),
    FRIDAY("星期五", 6),
    SATURDAY("星期六", 7);

    private String content;
    private Integer value;

    WeekEnum02(String content, Integer value) {
        this.content = content;
        this.value = value;
    }

    public String getContent() {
        return content;
    }

    public Integer getValue() {
        return value;
    }
}
