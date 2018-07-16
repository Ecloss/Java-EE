package reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DemoTest01 {

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
            for (Method method : mt) {
                System.out.println(method);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
