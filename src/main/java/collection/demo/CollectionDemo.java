package collection.demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

    public static void main(String[] args) {
        Collection coll = new ArrayList();
        methodDemo(coll);
        //System.out.println("---------------------------");
        methodAllDemo();
    }

    /**
     * 演示Collection中的基本功能
     */
    public static void methodDemo(Collection coll) {

        //  1. 添加元素  返回boolean
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");

        //  2.删除元素  返回boolean
        coll.remove("abc1");

        //  3.清除所有的元素  void
        coll.clear();

        //  4.包含判断
        System.out.println("contains: " + coll.contains("abc1"));

        System.out.println(coll);
    }

    /**
     * 演示带All的方法
     */
    public static void methodAllDemo() {

        //  1.创建两个容器
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();

        //  2.添加元素
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc4");

        c2.add("abc2");
        c2.add("abc3");
        c2.add("abc5");

        //  往c1中添加c2
        c1.addAll(c2);

        //  判断c1中是否包含c2中所有的元素
        boolean b = c1.containsAll(c2);
        System.out.println("b = " + b);

        //  从c1中删除c2， 将c1中和c2相同的元素从c1删除
        c1.removeAll(c2);
        System.out.println(c1);

        c1.retainAll(c2);
        System.out.println(c1);

    }

}
