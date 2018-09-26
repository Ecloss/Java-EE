package Basic;

import java.util.Scanner;

/**
 * @author 余修文
 * @date 2018/9/26 8:09
 */
public class B1027 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = 1, len = 0;
        String a;
        int N, top, down;
        N = in.nextInt();   a = in.next();
        while (true) {
            if(p == 1 && (N - 1) >= 0) {
                N--;
                len++;
            } else if(p > 1 && (N - 4*p + 2) >= 0) {
                N = N - 4*p + 2;
                len += 2;
            } else {
                break;
            }
            p++;
        }
        top = (len + 1) / 2;
        down = (len - 1) / 2;
        for (int i = top; i >= 1; i--) {
            for (int j = 0; j < top-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i-1; k++) {
                System.out.print(a);
            }
            System.out.println();
        }
        for (int i = 1; i <= down; i++) {
            for(int j = 0; j < down-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i + 1; k++) {
                System.out.print(a);
            }
            System.out.println();
        }
        System.out.println(N);
    }

}
