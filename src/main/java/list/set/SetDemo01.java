package list.set;

import org.junit.Test;

import java.util.*;

/**
 * @author 余修文
 * @date 2018/9/28 16:59
 */
public class SetDemo01 {

    /**
     * 得到结果为1， 2， 3， 4， 5
     * 因此HashSet是有序的
     */
    @Test
    public void demo01() {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(5);
        set.add(2);
        set.add(3);
        set.add(4);
        set.forEach(i -> System.out.println(i));
    }

    @Test
    public void demo05() {
        Set<String> set = new HashSet<String>();
        set.add("abc5");
        set.add("abc14");
        set.add("abc13");
        set.add("abc31");
        set.forEach(str -> System.out.println(str));
    }

    @Test
    public void test02() {
        Set<Integer> set = new AbstractSet<Integer>() {
            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };
        set.add(1);
        set.add(5);
        set.add(2);
        set.add(3);
        set.add(4);
        set.forEach(i -> System.out.println(i));
    }

    /**
     * TreeSet存Integer数据时，其显示是有序的
     */
    @Test
    public void demo03() {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(1);
        set.add(5);
        set.add(2);
        set.add(3);
        set.add(4);
        set.forEach(i -> System.out.println(i));
    }

    /**
     * HashSet 和 TreeSet 都是有序排列
     */
    @Test
    public void demo06() {
        Set<String> set = new TreeSet<String>();
        set.add("abc5");
        set.add("abc14");
        set.add("abc13");
        set.add("abc31");
        set.toArray();
        set.forEach(str -> System.out.println(str));
    }

}
