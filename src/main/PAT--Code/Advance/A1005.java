package Advance;

import java.util.Scanner;

/**
 * @author 余修文
 * @date 2018/10/5 11:19
 */
public class A1005 {

    static String[] let = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        int[] x = new int[5];
        int num = 0, len = 0;
        str = in.next();
        for (int i = 0; i < str.length(); i++) {
            num += str.charAt(i) - '0';
        }
        do {
            x[len++] = num % 10;
            num = num / 10;
        } while (num != 0);
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(let[x[i]]);
            if (i != 0) {
                System.out.print(" ");
            }
        }

    }

}
