package Advance;

import java.util.Scanner;

/**
 * @author 余修文
 * @date 2018/9/25 19:33
 */
public class A1036 {
    static class Stu{
        String name, ID;
        String sex;
        int grade;

        public Stu(String name, String ID, String sex, int grade) {
            this.name = name;
            this.ID = ID;
            this.sex = sex;
            this.grade = grade;
        }

        public Stu(String name, String ID, String sex, String grade) {
            this.name = name;
            this.ID = ID;
            this.sex = sex;
            this.grade = Integer.valueOf(grade) ;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        Stu boy, girl, temp = null;
        boy = new Stu(null, null, null, 101);
        girl = new Stu(null, null, null, -1);
        N = in.nextInt(); in.nextLine();

        for(int i = 0; i < N; i++) {
            String[ ] str  =in.nextLine().split(" ");
            temp = new Stu(str[0], str[1], str[2], str[3]);
            //in.next();
            if("M".equals(temp.sex) && boy.grade > temp.grade) {
                boy = temp;
            }
            if("F".equals(temp.sex) && girl.grade < temp.grade) {
                girl = temp;
            }
        }
        if(girl.grade == -1) {
            System.out.print("Absent\n");
        } else {
            System.out.println(girl.name + " " + girl.grade);
        }
        if(boy.grade == 101) {
            System.out.print("Absent\n");
        } else {
            System.out.println(boy.name + " " + boy.grade);
        }
        if (girl.grade == -1 || boy.grade == 101) {
            System.out.print("NA\n");
        } else {
            System.out.println( (girl.grade - boy.grade) );
        }
    }

}
