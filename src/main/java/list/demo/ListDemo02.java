package list.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 余修文
 * @date 2018/10/19 9:57
 */
public class ListDemo02 {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("abc");
        list.add("abc");
        list.add("abc1");
        list.add("abc1");
        list.add("abc2");
        list.add("abc2");
        System.out.println(list);
        singleElement(list);
        System.out.println(list);
    }

    /**
     * 去除重复元素方式一。
     */
    public static void singleElement(List list) {
        // 定义一个临时容器
        List temp = new ArrayList();

        // 遍历原来的容器
        for (Iterator it = list.iterator(); it.hasNext();) {
            Object obj = (Object)it.next();
            // 确认temp数组中是否有该元素，如果没有加上
            if (!temp.contains(obj)) {
                temp.add(obj);
            }
        }

        // 清除数组中的所有元素
        list.clear();
        // 添加所有的数组到list
        list.addAll(temp);
    }

}
