package reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DemoTest01 {
    /**
     * 业务需求，执行某个类中全部的以test
     * 为开头的无参数无返回的非静态方法
     * @param args
     */

    public static void main(String[] args)  {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("请输入类名");
            String className = in.nextLine();
            //  获取动态类
            Class cls = Class.forName(className);
            //  创建动态对象
            Object obj = cls.newInstance();
            //  获取动态方法
            Method[] mt = cls.getDeclaredMethods();
            Object obj1 = "";
            for (Method method : mt) {
                if (method.getName().startsWith("test")) {
                    System.out.println(method);
                    method.invoke(obj);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
