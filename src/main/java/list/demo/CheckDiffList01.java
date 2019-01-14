package list.demo;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 查看两个集合的元素是否相等，复习
 *
 * @author 余修文
 * @date 2019/1/10 9:48
 */
public class CheckDiffList01 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i  < 1000; i++) {
            list.add("test" + i);
            list.add("test" + (i*2));
        }
        System.out.println();
    }

    private static boolean checkDiffrent01(List<String> list, List<String>list1) {
        long st = System.nanoTime();
        if (list.size() != list1.size()) {
            System.out.println("消耗的时间为：" + (System.nanoTime() - st));
            return false;
        }
        for (String str : list) {
            if (!list1.contains(str)) {
                System.out.println("消耗的时间为：" + (System.nanoTime() - st));
                return false;
            }
        }
        System.out.println("消耗的时间为：" + (System.nanoTime() - st));
        return true;
    }

    private static boolean checkDiffrent02(List<String> list, List<String>list1) {
        long st = System.nanoTime();
        System.out.println("消耗的时间为：" + (System.nanoTime() - st));
        return !list1.retainAll(list);
    }

    private static boolean checkDiffrent03(List<String> list, List<String>list1) {
        long st = System.nanoTime();
        Map<String, Integer> map = new HashMap<>(list.size() + list1.size());
        if (list.size() != list1.size()) {
            System.out.println("消耗的时间为：" + (System.nanoTime() - st));
            return false;
        }
        for (String str : list) {
            map.put(str, 1);
        }
        for (int i = 0; i < list1.size(); i++) {
            Integer cc = map.get(list1.get(i));
            if (cc != null) {
                continue;
            }
            System.out.println("消耗的时间为：" + (System.nanoTime() - st));
            return false;
        }
        System.out.println("消耗的时间为：" + (System.nanoTime() - st));
        return true;
    }

    private static boolean checkDiffrent04(List<String> list, List<String>list1) {
        long st = System.nanoTime();
        String strList = SecureUtil.md5(list.toString());
        String strList1 = SecureUtil.md5(list1.toString());
        System.out.println("消耗的时间为：" + (System.nanoTime() - st));
        return strList.equals(strList1);
    }

    private static boolean checkDiffrent05(List<String> list, List<String>list1) {
        long st = System.nanoTime();
        String strList = list.stream().sorted().collect(Collectors.joining());
        String strList1 = list.stream().sorted().collect(Collectors.joining());
        System.out.println("消耗的时间为：" + (System.nanoTime() - st));
        return strList.equals(strList1);
    }

    private static boolean checkDiffrent06(List<String> list, List<String>list1) {
        long st = System.nanoTime();
        list.sort(Comparator.comparing(String::hashCode));
        list1.sort(Comparator.comparing(String::hashCode));
        System.out.println("消耗的时间为：" + (System.nanoTime() - st));
        return list.toString().equals(list1.toString());
    }

}
