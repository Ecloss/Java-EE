package reflect.demo;

import reflect.Test;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 *  动态执行一个类中全部以@Demo注解标注的方法
 */
public class DemoTest02 {

    public static void main(String[] args) throws  Exception {
        //  1.动态加载类
        Scanner in = new Scanner(System.in);
        String className = in.nextLine();
        //  2.动态获取全部方法
        Class cls = Class.forName(className);
        Object obj = cls.newInstance();
        Method[] methods = cls.getDeclaredMethods();
        //  3. 动态检查方法的注解信息
        for (Method method : methods) {
            System.out.println("methodName = " + method.getName());
            //Test test = method.getAnnotation(Test.class);
            Test test = method.getAnnotation(Test.class);
            System.out.println(test);
            if (test != null) {
                Object value = method.invoke(obj);
                System.out.println("value = " + value);
            }
        }
    }

}
