package api.string;

/**
 * @author 余修文
 * @date 2018/7/29 17:44
 */
public class StringDemo01 {

    public static void main(String[] args) {

        String str = "abcd";
        // 创建新的String对象，因此在常量池中是有hashCode和value值得， 因此与str的hashCode不同，但是值是相同的
        String str1 = new String("abcd");

        System.out.println(str == str1);
        System.out.println(str1.equals(str));

        System.out.println("----------------");

        //-->在常量池中 为 "abc" 分配了一片空间，地址值赋给s1，s1指向"abc"。
        String s1 = "abc";
        //-->创建"abc"临时数据，到常量池里去找，如果有，直接取地址赋给s2，如果没有，存进常量池，在取地址给s2
        String s2 = "abc";

        System.out.println(s1 == s2);

    }

}
