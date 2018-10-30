package list.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 余修文
 * @date 2018/10/19 9:40
 */
public class ListDemo01 {

    /**
     * ArrayList 是按照原数组的50% 延长，构造一个初始容量为10 的空列表
     * @param args
     */
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        // 添加Person类型的对象
        Person p1 = new Person("list1", 21);
        Person p2 = new Person("list2", 22);

        list.add(p1);
        list.add(p2);

        for (Iterator it = list.iterator(); it.hasNext();) {
            Person person = (Person)it.next();
            System.out.println(person.getName() + " -- " + person.getAge());
        }
    }

}
