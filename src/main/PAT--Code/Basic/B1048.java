package Basic;

import java.util.Scanner;

/**
 * @author 余修文
 * @date 2018/9/29 10:19
 */
public class B1048 {

    /**
     * StringBuffer的几个方法： insert , append,  replace insert, delete, reverse, charAt, subString
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  str1 = new StringBuffer(in.next()).reverse().toString();
        String str2 = new StringBuffer(in.next()).reverse().toString();
        int len1 = str1.length();   int len2 = str2.length();
        int len = len1 > len2 ? len1 : len2;
        int a, b, k = 0;
        StringBuffer str3 = new StringBuffer();
        String temp = "0123456789JQK";
        for(int i = 0; i < len; i++) {
            a = i < len1 ? str1.charAt(i) - '0' : 0;
            b = i < len2 ? str2.charAt(i) - '0' : 0;
            if (i % 2 == 0) {
                str3.append(temp.charAt((a+b)%13));
            } else {
                int count = b - a;
                if (count < 0) {
                    count += 10;
                }
                str3.append(temp.charAt(count));
            }
        }
        String str4 = str3.reverse().toString();
        System.out.print(str4);
    }

}
