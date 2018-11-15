package lambda.stream;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream流的概念
 *
 * @author 余修文
 * @date 2018/10/30 17:25
 */
public class StreamDemo01 {

    public static void main(String[] args) {

        /**
         * 创建stream
         */
        String[] strings = new String[]{"a", "b", "c"};
        // 1. Stream.of 方法
        Stream<String> streamDemo01 = Stream.of(strings);
        // 2. Array.stream
        Stream<String> streamDemo02 = Arrays.stream(strings);
        // 3. list.stream
        List<String> list = Arrays.asList(strings);
        List<String> list1 = streamDemo01.collect(Collectors.toList());
        ;
        Stream<String> streamDemo03 = list.stream();

        /**
         * 1. map 映射
         * 2. flat
         * 3. flatMap
         * 4. filter
         * 5. forEach
         */
        List<String> list2 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list2.toString());

    }

    String[] str2 = new String[]{"abc", "hello", "keep", "Time"};
    Integer[] init = new Integer[]{1, 2, 3, 4, 5};
    List<String> strList = Arrays.asList(str2);
    List<Integer> intList = Arrays.asList(init);
    Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6);

    @Test
    public void demo01() {
        List<String> list = Arrays.asList(str2);
        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
    }

    @Test
    public void demo02() {
        intList.stream().map(i -> i * i).forEach(i -> System.out.println(i));
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i) * intList.get(i));
        }
    }

    /**
     * map是对数据进行操作，1 : 1关系
     * flatMap 是对数据进行操作，不过是1 : N 的关系
     * flat 是对数据进行筛选
     */
    @Test
    public void demo03() {
        // flat 对数据进行筛选
        List<Integer> list = stream1.filter(i -> i > 3).collect(Collectors.toList());
        System.out.println(list);
    }

    /**
     * 加上forEach
     */
    @Test
    public void demo04() {
        stream1.filter(i -> i > 2 && i < 5).forEach(i -> System.out.println(i));
    }

    /**
     * peek:对这个对象进行操作（或者输出，或者复制，但是结果不变）
     */
    @Test
    public void demo05() {
        List<Integer> list =
        stream1.filter(i -> i >= 3).peek(s -> System.out.println("长度大于2的字符串为：" + s) ).filter(i -> i>= 4).peek(s -> System.out.println("长度大于3的字符串为：" + s)).collect(Collectors.toList());
    }

    @Test
    public void demo06() {
        Optional<Integer> optional = intList.stream().findFirst();
        System.out.println(optional.orElse(100));
    }

}
