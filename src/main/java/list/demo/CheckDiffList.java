package list.demo;


import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 判断两个集合是否相等
 *
 * @author 余修文
 * @date 2019/1/9 10:00
 */
public class CheckDiffList implements Serializable {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add("test" + i);
            list1.add("test" + i * 2);
        }
        System.out.println(checkDiffrent5(list, list1));
    }

    /**
     * 方法1
     */
    private static boolean getDiffrent(List<String> list, List<String> list1) {
        long st = System.nanoTime();
        if (list.size() != list1.size()) {
            System.out.println("消耗时间为： " + (System.nanoTime() - st));
            return false;
        } else {
            for (String str : list) {
                if (!list1.contains(str)) {
                    System.out.println("消耗时间为： " + (System.nanoTime() - st));
                    return false;
                }
            }
        }
        System.out.println("消耗时间为： " + (System.nanoTime() - st));
        return true;
    }

    /**
     * 方法2
     */
    private static boolean getDiffrent1(List<String> list, List<String> list1) {
        long st = System.nanoTime();
        System.out.println("消耗时间为：" + (System.nanoTime() - st));
        return !list.retainAll(list1);
    }

    /**
     * 方法3
     * 利用HashMap key唯一，value可以重复的特点，把list中各种元素放到hashMap中
     */
    private static boolean getDiffrent2(List<String> list, List<String> list1) {
        long st = System.nanoTime();
        Map<String, Integer> map = new HashMap<>(list.size() + list1.size());
        if (list.size() != list1.size()) {
            System.out.println("消耗时间为： " + (System.nanoTime() - st));
            return false;
        }
        for (String str : list) {
            map.put(str, 1);
        }
        for (String str : list1) {
            Integer cc = map.get(str);
            if (null != cc) {
                continue;
            }
            System.out.println("消耗时间为： " + (System.nanoTime() - st));
            return false;
        }
        System.out.println("消耗时间为： " + (System.nanoTime() - st));
        return true;
    }

    /**
     * md5加密法使用
     * 方法4
     */
    private static boolean getDiffrent3(List<String> list, List<String> list1) {
        long st = System.nanoTime();
        String str = SecureUtil.md5(list.toString());
        String str1 = SecureUtil.md5(list1.toString());
        System.out.println("消耗时间为： " + (System.nanoTime() - st));
        return str.equals(str1);
    }

    private static boolean checkDiffrent4(List<String> list, List<String> list1) {
        long st = System.nanoTime();
        System.out.println(list.stream().sorted().collect(Collectors.joining()).toString());
        System.out.println((System.nanoTime() - st));
        return list.stream().sorted().collect(Collectors.joining()).equals(list1.stream().sorted().collect(Collectors.joining()));
    }

    private static boolean checkDiffrent5(List<String> list, List<String> list1) {
        long st = System.nanoTime();
        System.out.println((System.nanoTime() - st));
        list.sort(Comparator.comparing(String::hashCode));
        list1.sort(Comparator.comparing(String::hashCode));
        return list.toString().equals(list1.toString());
    }

}
