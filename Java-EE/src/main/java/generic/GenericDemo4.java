package generic;

import domain.Student;
import domain.Tool2;
import domain.Util;
import domain.Worker;

public class GenericDemo4 {

    public static void main(String[] args) {

        /**
         *  泛型1：泛型类--> 泛型定义在类上
         */

        //  JDK 1.4
        Tool2 tool2 = new Tool2();
        tool2.setObj(new Worker());
        Student student = (Student)tool2.getObj();
        //System.out.println(student);

        //  JDK 1.5
        Util<Student> util = new Util<Student>();
        //util.setObj(new Worker());
        Student stu = util.getObj();    //  避免了向下转型，不用强制类型转换
        System.out.println(stu);

    }

}
