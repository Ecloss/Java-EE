package z_test;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 检查字符串是否全为数字
 *
 * @author 余修文
 * @date 2019/1/10 13:38
 */
public class CheckStrIsNum {

    public static void main(String[] args) {
        double aa = -192322.1212;
        String a = "-192322.1212";
        String b = "-192322a1212";
        String c = "Java";
        String d = "5.1";
        /** 判断是否全为数字 */
        System.out.println(checkStrIsNum01(Double.toString(aa)));
        System.out.println(checkStrIsNum01(a));
        System.out.println(checkStrIsNum01(b));
        System.out.println(checkStrIsNum01(c));
        System.out.println(checkStrIsNum01(d));
    }

    /**
     * 利用Character.isDig(char ch) 方法
     * 答案：
     * -
     * false
     * -
     * false
     * -
     * false
     * J
     * false
     *
     * @param str
     * @return
     */
    public static boolean checkStrIsNum01(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static Pattern NUMBER_PATTERN = Pattern.compile("-?[0-9]+.?[0-9]+");

    /**
     * 正则表达式
     */
    public static boolean checkStrIsNum02(String str) {
        Matcher isNum = NUMBER_PATTERN.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }

    private static Pattern NUMBER_PATTERN02 = Pattern.compile("-?[0-9]+.?[0-9]+");

    /**
     * 正则表达式
     */
    public static boolean checkStrIsNum03(String str) {
        Matcher isNum = NUMBER_PATTERN02.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }

    private static Pattern NUMBER_PATTERN03 = Pattern.compile("-?[0-9]+(\\.[0-9]+)?");
    /**
     * 正则表达式
     */
    public static boolean checkStrIsNum05(String str) {
        String bigStr;
        try {
            bigStr = new BigDecimal(str).toString();
        } catch (Exception e) {
            return false;
        }
        Matcher isNum = NUMBER_PATTERN03.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }

    /**
     * 利用BigDecimal判断是否位数字
     * 如果是数字，创建new Bigdecimal() 时肯定不会报错，但是有个问题，如果有“-”负号的话也会返回false
     */
    public static boolean checkStrIsNum06(String str) {
        String bigStr;
        try {
            bigStr = new BigDecimal(str).toString();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
