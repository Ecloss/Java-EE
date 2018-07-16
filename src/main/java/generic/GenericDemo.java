package generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericDemo {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("abc");
        list.add(4);

        for (Iterator it = list.iterator(); it.hasNext(); ) {

            System.out.println(it.next());
            //  等价于：
            Object obj = it.next();
            System.out.println(obj.toString());

            String str = (String)it.next();
            System.out.println(str.length());
            //  ->java.lang.ClassCastException
        }

        //  为了在运行时期不出现类型异常，可以在定义容器时，就明确容器中的元素的类型

        List<String> list1 = new ArrayList<String>();
        list1.add("abc");
        for (Iterator<String> it = list1.iterator(); it.hasNext(); ) {
            String str = it.next();
            System.out.println(str.length());
        }

    }

}
