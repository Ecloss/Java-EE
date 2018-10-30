package api.date;

import api.model.Student;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 日期函数
 *
 * @author 余修文
 * @date 2018/7/30 23:11
 */
public class DateDemo01 {

    public static void main(String[] args) {

        /**
         * 演示Date对象
         * 将日期对象转换成日期格式的字符串--> DateFormat类中的format方法
         * 日期的格式化
         */
        Date date = new Date();
        System.out.println(date);

        // 通过DateFormat类中的静态工厂方法获取示例
        DateFormat dateFormat = DateFormat.getDateInstance();

        // 通过DateFormat的format方法，对日期对象进行格式化，将日期对象转成日期格式的字符串
        String strDate1 = dateFormat.format(date);
        System.out.println(strDate1);

        // 转换成自定义风格。xxxx-xx-xx xx:xx 只能自定义格式化风格的对象，只有子类可以做到
        dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        String strDate02 = dateFormat.format(date);
        System.out.println(strDate02);

    }

    @Test
    public void demo01() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        long value = 20181212;
        Date date = new Date(value);
        System.out.println(date);
        String strDate = dateFormat.format(date);
        System.out.println(strDate);
    }

    @Test
    public void demo02() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String str_date1 = dateFormat.format(date);

        DateFormat dateFormat1 = DateFormat.getDateInstance();
        String str_date2 = "2013-03-13";

        System.out.println();
    }

    @Test
    public void demo03() {
        long L = System.currentTimeMillis();
        System.out.println(L);
        Date date1 = new Date(L);
        System.out.println(date1);
    }

    @Test
    public void demo04() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = " 2017-12-08 19:20:00 ";
        Date currentTime_2 = formatter.parse(str);
        System.out.println(currentTime_2);
        System.out.println(currentTime_2.toLocaleString());
    }

    @Test
    public void test04() {
        List<Student> list = new ArrayList<Student>();
        Student student = new Student("A", 1);
        Student student1 = new Student("F", 6);
        Student student2 = new Student("E", 5);
        Student student3 = new Student("D", 4);
        Student student4 = new Student("C", 3);
        Student student5 = new Student("B", 2);
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        for (Student s : list) {
            System.out.println(s.getName() + "--" + s.getAge());
        }

        // Some comparators like (person1, person2) -> person1.getName().compareTo(person2.getName()) could be simplified like this: Comparator.comparing(Person::getName).
        //list = list.stream().sorted((a, b) -> a.getAge().compareTo(b.getAge())).collect(Collectors.toList());
        list = list.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());

        for (Student s : list) {
            System.out.println(s.getName() + "--" + s.getAge());
        }
    }

    @Test
    public void test05() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("Gyyyy年中的第D天");
        Date d = new Date();
        // 将d格式化成日期，输出：公元2018年中的第302天
        String dateStr = simpleDateFormat.format(d);
        System.out.println(dateStr);
        // 很好奇，如果将simpleDateFormat中的格式变成其他回事什么结果
        SimpleDateFormat sdf1 = new SimpleDateFormat("D");
        String dateStr1 = sdf1.format(d);
        System.out.println(dateStr1);

        // 格式化代码时间
        System.out.println("---------------------3--------------------------");
        System.out.println(d.toString());
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String stringDate2 = sdf2.format(d);
        System.out.println(stringDate2);

        // 只显示年-月-日
        System.out.println("------------------4---------------------------");
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd");
        // 大M 和小m 的区别：大M代表月份，小m代表月份
        SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-mm-dd");
        String stringDate4 = sdf4.format(d);
        String stringDate5 = sdf5.format(d);
        System.out.println("大M：" + stringDate4);
        System.out.println("小M：" + stringDate5);

    }

}
