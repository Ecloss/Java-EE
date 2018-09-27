package Basic;

import java.util.Scanner;

/**
 * @author 余修文
 * @date 2018/9/26 9:39
 */
public class B1022 {

    static int maxn = 100;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A, B, C;
        long a[] = new long[maxn];
        int D, len = 0;
        A = in.nextLong(); B = in.nextLong(); D = in.nextInt();
        C = A + B;
        do {
            a[len++] =  C % D;
            C = C / D;
        } while (C != 0);
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }

}
