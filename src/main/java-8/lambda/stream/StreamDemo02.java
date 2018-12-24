package lambda.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * 流式计算
 *
 * @author 余修文
 * @date 2018/10/31 9:17
 */
public class StreamDemo02 {
    Integer[] init = new Integer[]{1, 2, 3, 4, 5};
    List<Integer> initList = Arrays.asList(init);
    String[] str = new String[]{"abc", "hello", "keep", "Time"};
    List<String> strList = Arrays.asList(str);

    /**
     * Stream 流的几个重要的运算：1. collect(Collectors.toList); stream流转成集合
     * 2. map 对每个数据进行操作，修改。一般应该在filter之后，因为需要先筛选需要的数据，在对数据进行操作
     * 3. filter 对数据进行筛选
     * 4. forEach: 循环，不对数据进行任何操作，只是输出
     * 5. reduce：规约， 对数据进行合并，统计，等等
     * 6. sort: 排序
     * 7. Match: 匹配多样性
     */

    /**
     * map：操作
     */
    @Test
    public void demo01() {
        strList.stream().map(s -> s + "--").forEach(s -> System.out.println(s));
    }

    @Test
    public void demo02() {
        Integer i = 1;
        initList.stream()
                .map(integer -> integer += i)
                .forEach(integer -> System.out.println(integer));
    }

    /**
     * filter: 筛选操作
     */
    @Test
    public void demo03() {
        initList.stream()
                .map(i -> i++)
                .filter(i -> i >= 3)
                .forEach(i -> System.out.println(i));
    }

    @Test
    public void demo04() {
        strList.stream()
                .map(s -> s + "a")
                .filter(s -> s.endsWith("a"))
                .forEach(s -> System.out.println(s + "\n"));
    }

    @Test
    public void demo05() {
        strList.stream()
                .map(s -> s + "a")
                .filter(s -> s.startsWith("a"))
                .forEach(s -> System.out.println(s));
    }

    /**
     * sort: 排序
     */
    @Test
    public void demo06() {
        strList.stream().forEach(s -> System.out.println(s));
        System.out.println("排序好后的数据");
        strList.stream()
                .sorted((s1, s2) -> s2.length() - s1.length())
                .forEach(s -> System.out.println(s));
    }

    /**
     * Match匹配：返回一个Boolean类型，
     * allMatch：所有的元素都要通过
     * anyMatch：只要有一个不通过
     * noneMatch：一个都不通过
     */
    @Test
    public void demo07() {
        Boolean isAllMore = initList.stream().allMatch(integer -> integer >= 1);
        System.out.println("集合框架中是否全都大于等于1：" + isAllMore);
    }

    @Test
    public void demo08() {
        Boolean isAllMore = initList.stream().allMatch(integer -> integer >= 2);
        System.out.println("集合框架中是否全都大于等于2：" + isAllMore);
    }

    @Test
    public void demo09() {
        Boolean isAllMore = initList.stream().map(integer -> integer++).allMatch(integer -> integer >= 2);
        System.out.println("集合框架中是否全都大于等于2：" + isAllMore);
    }

    /**
     * anyMatch
     */
    @Test
    public void demo10() {
        Boolean isAnyMore = initList.stream().anyMatch(integer -> integer >= 3);
        System.out.println("集合框架中是否有大于等于3的：" + isAnyMore);
    }

    @Test
    public void demo11() {
        Boolean isAnyMore = initList.stream().anyMatch(integer -> integer >= 10);
        System.out.println("集合框架中是否有大于等于10的：" + isAnyMore);
    }

    /**
     * noneMatch
     */
    @Test
    public void demo12() {
        Boolean isNoneMore = initList.stream().noneMatch(integer -> integer >= 3);
        System.out.println("集合框架中是否全都小于3的：" + isNoneMore);
    }

    @Test
    public void demo13() {
        Boolean isNoneMore = initList.stream().noneMatch(integer -> integer >= 10);
        System.out.println("集合框架中是否全都小于10的：" + isNoneMore);
    }

    /**
     * reduce
     */
    @Test
    public void demo14() {
        IntStream intStream = IntStream.range(1, 10);
        // 从1 开始相加
        // 加法：5 + 1 + 2 + 3 + 4 +5 +6 +7 +8 +9 +10
        Integer num = intStream.reduce(5, (a, b) -> a + b);
        System.out.println(num);
    }

    @Test
    public void demo15() {
        IntStream intStream2 = IntStream.range(1, 10);
        OptionalInt optionalInt = intStream2.reduce((a, b) -> a < b ? a : b);
        IntStream intStream3 = IntStream.range(1, 10);
        OptionalInt optionalInt1 = intStream3.reduce((a, b) -> a < b ? a : b);
    }

    @Test
    public void demo16() {

    }


}
