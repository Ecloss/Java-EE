package Advance;

import java.util.Scanner;

/**
 * @author 余修文
 * @date 2018/9/26 21:34
 */
public class A1058 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str1 = in.next().split("[.]");
        String[] str2 = in.next().split("[.]");
        long count = Integer.parseInt(str1[0]) * 17 * 29 + Integer.parseInt(str1[1]) * 29 + Integer.parseInt(str1[2]) +
                Integer.parseInt(str2[0]) * 17 * 29 + Integer.parseInt(str2[1]) * 29 + Integer.parseInt(str2[2]);
        System.out.print(count/17/29 + "." + count / 29 % 17 + "." + count % 29);
    }

}
