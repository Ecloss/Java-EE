package api.string_stringBuffer;

import org.junit.Test;

/**
 * StringBuilder的四个方法：
 * append--追加，
 * insert--插入，
 * replace--替换，
 * reverse--反转
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

    @Test
    public void demo01() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Java");
        stringBuilder.insert(0, "First");
        stringBuilder.replace(0, 5, "Second ");
        stringBuilder.reverse();
        stringBuilder.indexOf("J");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.indexOf("J"));
    }

}
