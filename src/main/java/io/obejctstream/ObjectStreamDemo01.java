package io.obejctstream;




import io.obejctstream.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author 余修文
 * @date 2018/7/29 15:04
 */
public class ObjectStreamDemo01 {

    public static void main(String[] args) throws Exception {

        Student student = new Student("XiaoBai", 20);
        ObjectOutputStream oops = new ObjectOutputStream(
                new FileOutputStream("F:\\Workspace\\file\\model\\Student.txt")
        );
        oops.writeObject(student);
        oops.close();

        ObjectInputStream oips = new ObjectInputStream(
                new FileInputStream("F:\\Workspace\\file\\model\\Student.txt")
        );
        Student student1 = (Student) oips.readObject();
        oips.close();
        System.out.println(student1.toString());

    }

}
