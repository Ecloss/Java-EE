package api.math;

import com.sun.org.apache.bcel.internal.generic.F2D;

import java.math.BigDecimal;

/**
 * Bigdecimal
 *
 * @author Ecloss
 */
public class BigdecimalTest {

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

}
