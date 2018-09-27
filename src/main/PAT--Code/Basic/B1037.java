package Basic;

import java.util.Scanner;

public class B1037 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int G, S, K, P, A, change;
        String[] str = in.next().split("[.]");
        G = Integer.parseInt(str[0]);
        S = Integer.parseInt(str[1]);
        K = Integer.parseInt(str[2]);
        P = G * 29 * 17 + S * 29 + K;
        String[] str1 = in.next().split("[.]");
        G = Integer.parseInt(str1[0]);
        S = Integer.parseInt(str1[1]);
        K = Integer.parseInt(str1[2]);
        A = G * 29 * 17 + S * 29 + K;
        change = A - P;
        if(change < 0) {
            System.out.print("-");
            change = -change;
        }
        System.out.printf("%d.%d.%d", change / (17 * 29), change / 29 % 17, change % 29);

    }

}
