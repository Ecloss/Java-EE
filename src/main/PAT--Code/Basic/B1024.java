package Basic;

import java.util.Scanner;

/**
 * @author 余修文
 * @date 2018/9/28 8:56
 */
public class B1024 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        str = in.next();
        int len = str.length();
        if("-".equals(str.charAt(0))) {
            System.out.print("-");
        }
        int pos = 0;
        while (!"E".equals(str.charAt(pos))) {
            pos++;
        }
        int exp = 0;
        for (int i = pos + 2; i < len; i++) {
            exp = exp * 10 + (str.charAt(i) - '0');
        }
        if (exp == 0) {
            for (int i = 1; i < pos; i++) {
                System.out.print(str.charAt(i));
            }
        }
        if ("-".equals(str.charAt(pos + 1))) {
            System.out.print("0.");
            for (int i = 0; i < exp - 1; i++) {
                System.out.print("0");
            }
            System.out.print(str.charAt(1));
            for (int i = 3; i < pos; i++) {
                System.out.print(str.charAt(i));
            }
        } else {
            for (int i = 1; i < pos; i++) {
                if (".".equals(str.charAt(i))) {
                    continue;
                }
                System.out.print(str.charAt(i));
                if (i == exp + 2 && pos - 3 != exp) {
                    System.out.print(".");
                }
            }
            for (int i = 0; i < exp - (pos - 3); i++) {
                System.out.print("0");
            }
        }
    }

}
