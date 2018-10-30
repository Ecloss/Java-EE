package Basic;

import java.util.Scanner;

/**
 * @author 余修文
 * @date 2018/9/27 17:38
 */
public class B1021 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int[] arr = new int[10];
        int x;
        for (int i = 0; i < str.length(); i++) {
            x = str.charAt(i) - '0';
            arr[x]++;
        }
        for(int i = 0; i < 10; i++) {
            if (arr[i] != 0) {
                System.out.println(i + ":" + arr[i]);
            }
        }
    }

}
