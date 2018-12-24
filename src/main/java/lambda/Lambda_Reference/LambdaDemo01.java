package lambda.Lambda_Reference;

import org.junit.Test;

import java.lang.annotation.Repeatable;
import java.util.Arrays;
import java.util.function.Supplier;

/**
 * @author 余修文
 * @date 2018/9/29 14:04
 */
public class LambdaDemo01 {
    //GirlFactory girlFactory;

    /**
     * 第一种方法：静态方法引用，语法规则： Class::static_method
     */
    //@Test
    //public void demo01() {
    //    Girl[ ] girls = new Girl[10];
    //    // 创建一个girlFactory对象
    //    GirlFactory<Girl> girlFactory = Girl::new;
    //    girls[0] = girlFactory.create("sally",18);
    //    girls[1] = girlFactory.create("mengmeng",3);
    //    //Arrays.sort(girls, Girl::compareByAge);
    //}
    //
    ///**
    // * 第二种方法引用是特定对象的方法引用:  containingObject::instanceMethodName
    // */
    //@Test
    //public void demo02() {
    //    Girl[] girls = new Girl[10];
    //    GirlFactory<Girl> girlFactory = Girl::new;
    //    Girl xifu = girlFactory.create("sally",18);
    //    girls[0] = xifu;
    //    girls[1] = girlFactory.create("meng", 3);
    //    Arrays.sort(girls, xifu::compareByName);
    //}
    //
    ///**
    // * 第三种方法引用是特定类的任意对象的方法引用：ContainingType::methodName
    // */
    //@Test
    //public void demo03() {
    //    Girl[] girls = new Girl[10];
    //    GirlFactory<Girl> girlFactory = Girl::new;
    //    girls[0] = girlFactory.create("sally", 18);
    //    girls[1] = girlFactory.create("mengmeng", 10);
    //    Arrays.sort(girls, Girl::companyByHash);
    //}
    //
    ///**
    // * 第四种方法引用是构造器引用，语法规则：是Class::new，或者更一般的Class::new
    // * Class::new只能用在函数式接口中
    // */
    //@Test
    //public void demo04() {
    //    // 方法一：无参
    //    Supplier<Girl> supplier = Girl::new;
    //    Supplier<Girl> supplier1 = () -> new Girl();
    //
    //    Girl girl = supplier.get();
    //    Girl girl1 = supplier1.get();
    //
    //    // 方法二：有参
    //    GirlFactory<Girl> girlFactory = Girl::new;
    //    GirlFactory<Girl> girlFactory1 = (String name, Integer age) -> new Girl();
    //
    //    Girl girl2 = girlFactory.create(null, null);
    //    Girl girl3 = girlFactory1.create(null, null);
    //}

}
