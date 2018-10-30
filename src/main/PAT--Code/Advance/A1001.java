package Advance;

import java.util.Scanner;

/**
 * @author 余修文
 * @date 2018/9/29 11:21
 */
public class A1001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a + b, len = 0;
        if(c < 0) {
            System.out.print("-");
            c = -c;
        }
        int arr[] = new int[10];
        do {
            arr[len++] = c % 10;
            c = c / 10;
        } while (c != 0);
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if(i != 0 && i % 3 == 0) {
                System.out.print(",");
            }
        }

    }

}
