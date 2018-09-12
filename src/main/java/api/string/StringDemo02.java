package api.string;

/**
 * @author 余修文
 * @date 2018/7/29 17:49
 */
public class StringDemo02 {

    public static void main(String[] args) {

        String str = "abcdea";

        // 获取长度
        int len = str.length();
        System.out.println(len);

        // 获取指定位置的字符
        char ch = str.charAt(0);
        System.out.println(ch);

        // 获取字符所处的位置
        int index = str.indexOf('a');
        System.out.println(index);

        //获取最后一次所处的位置
        int lastIndex = str.lastIndexOf('a');
        System.out.println(lastIndex);

        System.out.println(str.indexOf('c', 2));

    }

}
