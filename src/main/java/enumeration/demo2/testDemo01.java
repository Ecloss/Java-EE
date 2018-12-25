package enumeration.demo2;

import org.junit.Test;

/**
 * 测试枚举类
 *
 * @author 余修文
 * @date 2018/12/10 10:44
 */
public class testDemo01 {

    @Test
    public void demo01() {
        System.out.println(WeekEnum.MONDAY.compareTo(WeekEnum.TUESDAY));
    }

    @Test
    public void demo02() {
        for (WeekEnum we : WeekEnum.values()) {
            System.out.println(we);
        }
    }

    /**
     * valueOf
      */
    @Test
    public void demo03() {
        System.out.println(WeekEnum.valueOf(WeekEnum.class, "MONDAY"));
        System.out.println(WeekEnum.valueOf(WeekEnum.class, "FRIDAY"));
        System.out.println(WeekEnum.valueOf(WeekEnum.class, "SUNDAY"));
    }

}
