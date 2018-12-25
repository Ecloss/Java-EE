package enumeration.demo;

import enumeration.Day;

public class EnumDemo {

    public static void main(String[] args) {

        //  直接引用
        Day day = Day.FRIDAY;
        //System.out.println(day3);

        System.out.println(People.MAN.getContent() + "----" + People.MAN.getValue());
        System.out.println(People.WOMAN.getContent() + "----" + People.WOMAN.getValue());

    }

}
