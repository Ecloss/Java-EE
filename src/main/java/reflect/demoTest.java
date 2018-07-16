package reflect;

import org.apache.poi.util.SystemOutLogger;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class demoTest  {

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
