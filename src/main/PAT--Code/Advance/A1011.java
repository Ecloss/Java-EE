package Advance;

import java.util.Scanner;

/**
 * @author 余修文
 * @date 2018/9/24 18:57
 */
public class A1011 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String win = "WTL";
        double num = 1.0, money, temp;
        int idx = 0;
        double[] a = new double[3];
        for(int i = 0; i < 3; i++) {
            double max = 0;
            for(int j = 0; j < 3; j++) {
                temp = in.nextFloat();
                if(temp > max) {
                    max = temp;
                    idx = j;
                }
            }
            System.out.print(win.charAt(idx) + " ");
            num *= max;
        }
        money = (num * 0.65 - 1) * 2;
        System.out.printf("%.2f", money);
    }

}
