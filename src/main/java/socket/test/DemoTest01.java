package socket.test;

import org.junit.Test;

import java.lang.reflect.Array;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 测试
 *
 * @author 余修文
 * @date 2018/12/13 11:47
 */
public class DemoTest01 {

    @Test
    public void demo01() {
        String str = "";
    }

    @Test
    public void demo02() {
        List list = new ArrayList();
    }

    /**
     * 数组转list， Arrays.asList
     */
    @Test
    public void demo03() {
        Integer[] integers = new Integer[100];
        for (int i = 0; i < 10; i++) {
            integers[i] = i;
        }
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(integers);
        System.out.println(list);
    }

    @Test
    public void demo13() {
        Integer[] integers = new Integer[100];
        for (int i = 0; i < 10; i++) {
            integers[i] = i;
        }
        List<Integer> list = new ArrayList<>();
        list = Stream.of(integers).collect(Collectors.toList());
        System.out.println(list);
    }

    /**
     * list 抓成数组， List.toArray()
     * list -> 数组  list.toArray()
     * 数组 -> list   Arrays.asList();
     */
    @Test
    public void demo04() {
        List<Integer> list = new ArrayList<>();
        for (Integer i = 1; i <= 5; i++) {
            list.add(i);
        }
        Integer[] integers = list.toArray(new Integer[list.size()]);
        System.out.println(integers[0]);
    }

    @Test
    public void demo12() {
        List<Integer> list = new ArrayList<>();
        for (Integer i = 1; i <= 5; i++) {
            list.add(i);
        }
        Integer[] integers = list.stream().toArray(Integer[]::new);
        System.out.println(integers[0]);
    }

    @Test
    public void demo05() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (true) {
                iterator.remove();
            }
            System.out.println(list);
        }
    }

    @Test
    public void  demo06() {
        List<String> list = new ArrayList<>();
        list.add("2");
        list.add("1");
        for (String item : list) {
            if (true) {
                list.remove(item);
            }
        }
        System.out.println(list);
    }

    @Test
    public void demo07() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (true) {
                list.remove(item);
            }
        }
        System.out.println(list);
    }

    @Test
    public void demo08() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }

    @Test
    public void demo09() {
        Random random = new Random(10);
        switch (random.nextInt()) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("a pei");
        }
    }

    @Test
    public void demo10() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        /* todo: 余修文，12/13， 在写一个stream */
        /// todo: 代办
        List<Integer> list1 = list.stream().filter(integer -> integer >= 2).collect(Collectors.toList());
        System.out.println(list1);
    }

    @Test
    public void demo11() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println(random.nextInt(10));
        }
    }

}
