package reflect.demo;

import reflect.Foo;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DemoTest01 {

    public static void main(String[] args) throws Exception {
        //  1.先创建输入对象
        Scanner in = new Scanner(System.in);
        System.out.println("请输入对象：");
        String className = in.nextLine();
        //  2.创建动态类
        Class cls = Class.forName(className);
        //  3.创建动态类的对象
        Object obj = cls.newInstance();
        //  4.创建动态方法
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        //  找到demo方法
        String name = "demo1";
        //  类型列表Class[]
        //  String.class表示字符串的类型
        //  int.class 表示int类型
        Class[] types = {String.class, int.class};
        //  根据方法签名在cls上查找方法信息   name是方法名，types是参数类型
        Method method = cls.getDeclaredMethod(name,types);
        System.out.println(method);
        //  执行私有方法
        //  打开私有方法的执行权限
        method.setAccessible(true);
        Object value = method.invoke(obj, "Xiaobai", 12);
        System.out.println(value);

        Foo foo = new Foo();

    }

}
