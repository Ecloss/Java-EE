package Basic;

import java.util.Scanner;

/**
 * @author 余修文
 * @date 2018/9/25 14:12
 */
public class B1036 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, len;
        String c;
        N = in.nextInt();   c = in.next();
        len = (N + 1) / 2;
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == len || j == 1 || j == N) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.printf("\n");
        }
    }

}
