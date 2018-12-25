package data_base;

/**
 * @author 余修文
 * @date 2018/11/11 21:37
 */
public class IntegerDemo {

    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;

        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("-------------------");
        System.out.println("max + 1 = " + (max + 1));
        System.out.println("min - 1 = " + (min - 1));

        /**
         * 强制类型转换
         */
        System.out.println("-----------强制类型转换-----------");
        System.out.println("min - 1 = " + (min - 1L));
        System.out.println("min - 1 = " + (min - (long)1));
        System.out.println("min - 1 = " + (long)(min - 1));

    }

}
