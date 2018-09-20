package Basic;

import java.util.Scanner;

/**
 * @author 余修文
 * @date 2018/9/20 13:12
 */
public class B1009 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        for(int i = str.length-1; i >= 0; i--) {
            System.out.print(str[i]);
            if(i != 0) {
                System.out.print(" ");
            }
        }
        in.close();
    }

}
