package Advance;

import java.util.Scanner;

/**
 * @author 余修文
 * @date 2018/9/26 9:12
 */
public class A1031 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        str = in.nextLine();
        int len = str.length();
        int N1 = (len + 2) / 3;
        int N3 = N1, N2 = len + 2 - 2 * N1;
        for (int i = 0; i < N1 - 1; i++) {
            System.out.print(str.charAt(i));
            for(int j = 0; j < N2 - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(str.charAt(len - i - 1));
        }
        for(int i = 0; i < N2; i++) {
            System.out.print(str.charAt(N1 - 1 + i));
        }
    }

}
