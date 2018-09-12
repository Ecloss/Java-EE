package api.string;

/**
 * @author 余修文
 * @date 2018/7/29 17:55
 */
public class StringDemo03 {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "java";

        test(s1, s2);

        System.out.println(s1 + "...." + s2);
    }

    public static void test(String s1, String s2) {
        s2.replace('a', 'c');
        s1 = s2;
        System.out.println(s1 + "-----" + s2);
    }

}
