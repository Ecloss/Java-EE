package list.test;


import domain.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        //  1. 创建ArrayList集合对象
        List list = new ArrayList();

        //  2. 添加Person类型的对象
        Person p1 = new Person("list1", 21);
        Person p2 = new Person("list2", 22);

        list.add(p1);
        list.add(p2);
        list.add(new Person("list2", 23));

        //  3.添加元素
        for (Iterator it = list.iterator(); it.hasNext(); ) {

            //  it.next()都是Object类型的，所以转换为具体的对象时，需要向下转型
            Person p = (Person) it.next();
            System.out.println(p.getName() + ":" + p.getAge());

        }

    }

}
