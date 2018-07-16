package enumeration;

import java.util.Iterator;
import java.util.Vector;

public class EnumerationDemo {

    public static void main(String[] args) {
        /**
         *  Enumeration:  枚举
         *  具备枚举取出方式的容器只有Vector
         */
        Vector v = new Vector();
        v.add("abc1");
        v.add("abc2");
        v.add("abc3");

        for (Iterator it = v.iterator(); it.hasNext(); ) {
            System.out.println("iterator: " + it.next() );
        }

        //  获取高级for  --> 无角标，仅为遍历
        for (Object obj : v) {
            System.out.println("foreach: " + obj );
        }

    }

}
