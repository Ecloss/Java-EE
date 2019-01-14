package api.math;

import com.sun.org.apache.bcel.internal.generic.F2D;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Bigdecimal
 *
 * @author Ecloss
 */
public class BigdecimalTest {

    public static void main(String[] args) {
        BigDecimal f1 = new BigDecimal("1234.12");
        BigDecimal f2 = BigDecimal.valueOf(0.01);
        BigDecimal f3 = new BigDecimal(0.05);
        System.out.println("使用String作为BigDecimal构造器参数：");

        System.out.println(f1.add(f2));
        System.out.println(f1.subtract(f2));
        System.out.println(f1.multiply(f2));
        System.out.println(f1.divide(f2));
    }

    @Test
    public void demo01() {
        BigDecimal big1 = new BigDecimal("0.005");
        BigDecimal big2 = new BigDecimal("0.1");
        BigDecimal big3 = BigDecimal.valueOf(0.1);
        BigDecimal big4 = BigDecimal.valueOf(1234.12);
        double d1 = big4.doubleValue();
        System.out.println(d1);
        System.out.println(big2.divide(big1));
        System.out.println(big3.add(big2));
        System.out.println(big3.multiply(big2));
        System.out.println(big3.subtract(big2));
        System.out.println(big1.add(big1));
        System.out.println(big1.add(big1).doubleValue());
    }

    @Test
    public void demo02() {
        BigDecimal big1 = new BigDecimal("0.005");
        System.out.println(big1.doubleValue());
    }

    @Test
    public void demo03() {
        BigDecimal big1 = new BigDecimal("1234.12");
        double d1 = big1.doubleValue();
        System.out.println(d1);
    }

    /**
     * int 转 Bigdecimal
     */
    @Test
    public void demo04() {
        int a = 101;
        BigDecimal big = new BigDecimal(a);
        System.out.println(big + "的数据类型是: " + big.getClass().getName());
    }

    /**
     * BigDecimal 转 int
     */
    @Test
    public void demo05() {
        BigDecimal big = new BigDecimal(102);
        int a = big.intValue() + 1;
        System.out.println(a);
    }

    /**
     * long 转 BigDecimal
     */
    @Test
    public void demo06() {
        long a = 104;
        BigDecimal big = new BigDecimal(a);
        System.out.println(big + "的数据类型是：" + big.getClass().getName());
    }

    /**
     * Bigdecimal 转 long
     */
    @Test
    public void demo07() {
        BigDecimal big = new BigDecimal(105);
        Long a = big.longValue();
        System.out.println(a + "的数据类型是：" + a.getClass().getName());
    }

    /**
     * double 转 BigDecimal
     */
    @Test
    public void demo08() {
        double a = 106.10;
        BigDecimal big = new BigDecimal(Double.toString(a));
        System.out.println(big + "的数据类型是：" + big.getClass().getName());
    }

    /**
     * Bigdecimal 转 double
     */
    @Test
    public void demo09() {
        BigDecimal big = new BigDecimal(107);
        double d = big.doubleValue();
        System.out.println(d);
    }

}
