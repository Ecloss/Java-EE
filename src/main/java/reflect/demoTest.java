package reflect;

import org.apache.poi.util.SystemOutLogger;

import java.lang.reflect.Method;
import java.util.Scanner;

public class demoTest  {

    /**
     * 方法：Class.forName     cls.newInstance     cls.getDeclaredMethods
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入类名");
        String className = in.nextLine();
        //  编译错误，是因为 出现ClassNotFoundException
        //  动态加载类
        Class cls = Class.forName(className);
        System.out.println(cls);
        //  动态创建对象
        Object obj = cls.newInstance();
        System.out.println("动态创建对象: " + obj);

        //动态获取类的信息
        //  从cls代表的类信息中获取全部的方法信息
        Method[] ary = cls.getDeclaredMethods();
        for (Method method : ary) {
            //  返回方法
            System.out.println(method);
            //  返回方法名
            System.out.println(method.getName());
            //  返回  返回类型
            System.out.println(method.getReturnType());
            //  返回方法的注释
            System.out.println("----" + method.getAnnotations());
        }

    }




    @Test
    public void test01( ) throws Exception {
        Scanner inp = new Scanner(System.in);
        System.out.println("请输入一个类名");
        String className = inp.nextLine();
        Class cls = Class.forName(className);
        System.out.println(cls);
    }

}
