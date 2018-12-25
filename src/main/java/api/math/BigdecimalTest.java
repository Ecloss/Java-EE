package api.math;

import com.sun.org.apache.bcel.internal.generic.F2D;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Bigdecimal
 *
 * @author Ecloss
 */
public class  BigdecimalTest {

    public static void main(String[] args) {
        BigDecimal f1 = new BigDecimal("0.05");
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
        System.out.println(big2.divide(big1));
        System.out.println(big3.add(big2));
        System.out.println(big3.multiply(big2));
        System.out.println(big3.subtract(big2));
    }

}
