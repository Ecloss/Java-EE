package Advance;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 余修文
 * @date 2018/9/24 19:26
 */
public class A1006 {
    static class Work {
        static DateFormat format = new SimpleDateFormat("HH:mm:ss");
        String id;
        Date earlyDate;
        Date lateDate;

        public Work(String id, String earlyDate, String lateDate) throws Exception {
            this.id = id;
            this.earlyDate = format.parse(earlyDate);
            this.lateDate = format.parse(lateDate);
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Work early, late, temp, newTemp;
        int N;
        String[ ] str = in.nextLine().split(" ");
        temp = new Work(str[0], str[2], str[1]);
        early = temp;   late = temp;
        N = in.nextInt();
        for (int i = 1; i < N; i++) {
            str = in.nextLine().split(" ");
            newTemp = new Work(str[0], str[1], str[2]);
            if (newTemp.earlyDate.compareTo(early.earlyDate) < 0) {
                early = newTemp;
            }
            if(newTemp.lateDate.compareTo(late.earlyDate) > 0) {
                late = newTemp;
            }
        }
        System.out.print(early.id + " " + late.lateDate);
    }

}
