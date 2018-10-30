package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 余修文
 * @date 2018/9/29 13:42
 */
public class ListSubList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list.toString());
        System.out.println("----------------------");
        //  此处代表1 2 3 个下标元素
        List<Integer> subList = list.subList(1, 4);
        System.out.println(subList);
        // 删除subList下标为1的元素
        subList.remove(1);
        System.out.println("-----------------");
        System.out.println(list.toString());
        // 写一个Lambda表达式
        System.out.println("-------Lambda---------");
        list.forEach(i -> System.out.println(i));
    }

}
