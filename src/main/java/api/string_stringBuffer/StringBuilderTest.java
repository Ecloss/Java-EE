package api.string_stringBuffer;

/**
 * StringBuilder的四个方法append，insert，replace，reverse
 *
 * @author Ecloss
 */
public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //  追加字符串
        sb.append("java");
        System.out.println(sb);
        //  插入字符串
        sb.insert(0, "hello ");
        System.out.println(sb);
        //  替换
        sb.replace(5, 6, "-");
        System.out.println(sb);
        //  反转
        sb.reverse();
        System.out.println(sb);
        //  阐述
        sb.reverse();
        sb.delete(5, 6);
        System.out.println(sb);
        //  查看length和capacity的长度
        System.out.println("length = " + sb.length() + "  capacity = " + sb.capacity());
    }

}
