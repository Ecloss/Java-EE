package lambda.function_interface;

import org.junit.Test;

import java.util.function.Supplier;

/**
 * @author 余修文
 * @date 2018/9/29 14:52
 */
public class InterfaceDemo01 {

    @Test
    public void demo01() {
        Supplier<Runnable> c = ( ) -> () -> {     System.out.println("hi");};
        // 2.1 内层的 () -> {System.out.println("hi")}  对应Runnable的run方法
        // 其中run无参，并实现run方法，返回Runnable对象
        // 2.2 外层的 () -> 对应的Supplier的get方法， 当时用get方法会返回一个T对象
        // 3. 使用实例 启动线程
        new Thread(c.get()).start();
    }
}

/**
 * 函数式接口里只能有一个抽象方法，如果有多个抽象方法，就不能报错
 * 1. 定义：只拥有一个方法的接口称为函数式接口
 * 2. 使用：Java8中使用 @FunctionInterface  注解来显示指定一个接口是函数式接口
 * 3. 作用：主要是用来搭配Lambda表达式，简化语法，减少代码量
 */
@FunctionalInterface
interface Love{
    public void Like();

    //public void leave();
}