package list.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List list = new ArrayList();
        methodDemo(list);
    }

    /**
     * 演示list特有的方法
     */
    public static void methodDemo(List list) {

        //  1. 常规添加元素
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        System.out.println(list);

        //  2. 插入元素
        list.add(1, "hehe");
        System.out.println(list);

        //  3. 删除
        list.remove(1);
        list.remove("abc3");
        System.out.println(list);

        //  4.获取
        System.out.println(list.get(1));
        System.out.println(list.get(0));
        System.out.println(list.indexOf("abc3"));

        //  5. 修改
        list.set(1, "keke");

        System.out.println(list);

        //  6.取出集合中所有的元素 Iterator
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            System.out.println("iterator = " + it.next());
        }

        //  7.用list遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println("get: " + list.get(i));
        }

    }

}
