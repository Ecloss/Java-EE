package Advance;

import java.util.Scanner;

public class A1027 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "0123456789ABC";
        int a = in.nextInt(); int b = in.nextInt(); int c = in.nextInt();
        System.out.print("#" + str.charAt(a / 13) + str.charAt(a % 13) + str.charAt(b / 13) + str.charAt(b % 13) + str.charAt(c / 13) + str.charAt(c%13));
    }

}
