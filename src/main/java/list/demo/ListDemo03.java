package list.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    User man = new User(null, "XiaoBai", 18);
    User woman = new User(null, "Yeuul", 16);

    @Test
    public void demo02() {
        List<User> list = new ArrayList<>();
        list.add(man);
        list.add(woman);
        List<Integer> ageList = list.stream().map(User::getAge).collect(Collectors.toList());
        List<String> nameList = list.stream().map(User::getName).collect(Collectors.toList());
        List<Integer> IDList = list.stream().map(User::getID).collect(Collectors.toList());
        System.out.println("抽出的年龄为：" + ageList);
        System.out.println("抽出的姓名为：" + nameList);
        System.out.println("抽出的ID为：" + IDList);
    }

    @Test
    public void demo03() {
        List<User> list = new ArrayList<>();
        list.add(man);
        list.add(woman);
        List<Integer> IDList = list.stream().map(User::getID).collect(Collectors.toList());
        List<Integer> ageList = list.stream().map(User::getAge).collect(Collectors.toList());
        List<String> nameList = list.stream().map(User::getName).collect(Collectors.toList());
        System.out.println(IDList);
        System.out.println(ageList);
        System.out.println(nameList);
    }

}
