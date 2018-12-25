package list.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 余修文
 * @date 2018/10/30 17:03
 */
public class ListDemo03 {

    @Test
    public void demo01() {
        // 使用Lambda表达式遍历集合
        List<Person> list = new ArrayList<Person>();

        // 增加
        list.add(new Person("X1", 21));
        list.add(new Person("X2", 22));
        list.add(new Person("X3", 23));
        list.forEach(person -> System.out.println(person.getName() + "--" + person.getAge()));

        // 删除
        list.remove(0);
        list.forEach(person -> System.out.println(person.getName() + "--" + person.getAge()));

        // 查询
        System.out.println(list.get(0));

    }

}
