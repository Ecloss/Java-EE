package reflect.demo;

import java.lang.reflect.Method;
import java.util.Scanner;

public class TestCase03 {

    public static void main(String[] args) throws Exception {
        //  1.创建动态类
        Scanner in = new Scanner(System.in);
        String className = in.nextLine();
        Class cls = Class.forName(className);
        //  2.创建动态方法
        Object obj = cls.newInstance();
        //  3.创建动态方法
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.getAnnotations());
        }
        String name = "demo";
        Class[] types = {String.class, int.class};

        Method method = cls.getDeclaredMethod(name, types);
        method.setAccessible(true);
        System.out.println("method = " + method);
        Object value = method.invoke(obj, "XiaoBai", 21);
        System.out.println("value = " + value);
    }

}
