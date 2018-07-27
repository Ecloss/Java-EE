package io.recursio.demo;

/**
 * 递归实现:
 * 注意的条件：
 * 1. 一定要定义递归的条件
 * 2. 递归的次数不要过多。容易出现StackOverflowError----栈内存溢出错误
 *
 * @author Ecloss
 */
public class RecursioDemo {

    /**
     * 递归获得1到num的值得和
     *
     * @param num
     * @return
     */
    public static int getSum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + getSum(num - 1);
    }

    public static void main(String[] args) {

        int sum = getSum(3);
        System.out.println("sum = " + sum);

        int sum1 = getSum(999999);

    }

}
