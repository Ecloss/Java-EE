package Basic;

import java.util.Scanner;

/**
 * @author 余修文
 * @date 2018/9/27 17:10
 */
public class B1006 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 0; i < N/100; i++) {
            System.out.print("B");
        }
        for(int i = 0; i < N % 100 / 10; i++) {
            System.out.print("S");
        }
        for(int i = 1; i <= N % 10; i++) {
            System.out.print(i);
        }
    }

}
