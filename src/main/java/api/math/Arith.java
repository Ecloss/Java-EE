package api.math;

import java.math.BigDecimal;

/**
 * 精度BigDecimal
 *
 * @author Ecloss
 */
public class Arith {

    //  默认除法运算精度
    private static final int DEF_DIV_SCALE = 10;

    private Arith() {
    }

    //  提供精确的加法运算
    public static double add(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.add(b2).doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(add(0.1, 0.2));
    }

}
