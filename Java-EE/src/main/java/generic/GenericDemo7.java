package generic;

import domain.Student;

import java.util.*;

public class GenericDemo7 {

    public static void main(String[] args) {

        /**
         *  通配符<？>  --> 相当于<? extends Object>
         */
        List<String> list = new ArrayList<String>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        printCollection(list);

        Set<String> set = new HashSet<String>();
        set.add("haha");
        set.add("xixi");
        set.add("hoho");
        printCollection(set);

        List<Student> list2 = new ArrayList<Student>();
        list2.add(new Student("abc1", 21));
        list2.add(new Student("abc2", 22));
        list2.add(new Student("abc3", 23));
        list2.add(new Student("abc4", 24));
        printCollection(list2);
    }

    private static void printCollection(Collection<?> coll) {
        for (Iterator<?> it = coll.iterator(); it.hasNext(); ) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }

}
