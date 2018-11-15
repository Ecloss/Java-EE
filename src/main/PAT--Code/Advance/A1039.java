package Advance;

import java.util.*;

/**
 * @author 余修文
 * @date 2018/10/31 13:57
 */
public class A1039 {

    final int M = 26 * 26 * 26 * 10;
    final int N = 40010;

    public int getID(String name) {
        int ID = 0;
        for (int i = 0; i < name.length(); i++) {
            ID = ID * 26 + (name.charAt(i) - 'A');
        }
        ID = ID * 10 + (name.charAt(3) - '0');
        return ID;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        List<Integer[]> list = new ArrayList<Integer[]>();
        // n个人，k门课程
        int n = 0, k = 0;
        n = in.nextInt();
        k = in.nextInt();
        for (int i = 0; i < k; i++) {
            // course 课程, num 人数
            int course = 0, num = 0;
            course = in.nextInt();
            num = in.nextInt();
            name = in.nextLine();
            String[] str = name.split(" ");


        }
    }

}
