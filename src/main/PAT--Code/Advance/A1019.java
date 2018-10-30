package Advance;

import java.util.Scanner;

/**
 * @author 余修文
 * @date 2018/9/26 20:40
 */
public class A1019 {

    public static void main(String[] args) {
        int z[] = new int[40];
        int n, b, len = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt(); b = in.nextInt();
        do {
            z[len++] = n % b;
            n = n / b;
        } while (n != 0);
        boolean isFlag = true;
        for(int i = 0; i <= len/2; i++) {
            if (z[i] != z[len - 1 - i]) {
                isFlag = false;
            }
        }
        if (isFlag) {
            System.out.print("Yes\n");
        } else {
            System.out.print("No\n");
        }
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(z[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }

}
