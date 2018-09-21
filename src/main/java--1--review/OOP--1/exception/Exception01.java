package exception;

import java.lang.reflect.Type;

/**
 * java异常，运行过程中，---->  编译通过，发生了错误
 * 异常都是Throwable的子类
 * Throwable -- Exception
 *                   -- Error
 * Exception：运行时异常，非运行时异常（编译异常）
 * 抛出异常，捕获异常。
 * 捕获失败时，会抛出异常
 * try, catch, finally
 *
 * @author 余修文
 * @date 2018/9/13 10:50
 */
public class Exception01 {

    public void test01( ) {
        /**
            try {
                // 可能会发生异常的代码
            } catch (Type id1) {
                // 捕获并处置try抛出的异常类型type1
            }
         */
    }

    public static void main(String[ ] args) {
        int a = 6;
        int b = 0;
        try {
            System.out.println("a / b 的值是：" + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("b的值不能为0");
        }
        System.out.println("程序正常结束");
    }

}
