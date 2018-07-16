package enumeration.demo1;

public enum WeekEnum {

    //  在第一行显式地列出7个枚举实例（枚举值），系统会自动添加public static final修饰
    SUNDAY("星期日"), MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"),
    THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六");

    //  定义一个private修饰的实例变量
    private String date;

    WeekEnum(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 重写toString方法
     * @return
     */
    @Override
    public String toString() {
        return "WeekEnum{" +
                "date='" + date + '\'' +
                '}';
    }
}
