package list.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        list.add("abc3");
        list.add("abc6");

        list.forEach(str -> System.out.println(str));

        //System.out.println(list);
        //System.out.println("-------------------");
        //singleElement(list);
        //System.out.println(list);

    }

    public static void singleElement(List list) {
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j--);
                }
            }
        }
    }

}
