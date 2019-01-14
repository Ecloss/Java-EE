package enumeration.demo2;

/**
 * @author 余修文
 * @date 2018/12/10 10:37
 */
public enum WeekEnum {

    /**
     * 在第一行显式地列出7个枚举实例，系统会自动添加 public static final 修饰
     * 枚举相当于这个类的实例化对象，并且是static，final，可以直接调用
     */
    SUNDAY("星期日"),
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    STRURDAY("星期六");

    // 定义一个private， 修饰的实例变量
    private String content;

    private WeekEnum(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "WeekEnum{" +
                "content='" + content + '\'' +
                '}';
    }}
