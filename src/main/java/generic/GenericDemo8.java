package generic;

import domain.Person;
import domain.Student;
import domain.Worker;

import java.util.*;

public class GenericDemo8 {

    public static void main(String[] args) {

        /**
         *  泛型的限定
         */
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("abc1", 21));
        list.add(new Student("abc2", 22));
        list.add(new Student("abc3", 23));
        list.add(new Student("abc4", 24));
        printCollection(list);

        Set<Worker> set = new HashSet<Worker>();
        set.add(new Worker("haha", 23));
        set.add(new Worker("xixi", 24));
        set.add(new Worker("hoho", 21));
        set.add(new Worker("haha", 29));
        printCollection(set);
        List<Person> list4 = new ArrayList<>();

        List<? extends Person> list5 = new ArrayList<Student>();
        List<? super Student> list6 = new ArrayList<Person>();
    }


    /*
     * 泛型的限定：
     * ? extends E ：接收E类型或者E的子类型。-->泛型上限。
     * ? super E ：接收E类型或者E的父类型。-->泛型下限。
     */
    private static void printCollection(Collection<? extends Person> coll) {
        for (Iterator<? extends Person> it = coll.iterator(); it.hasNext();) {
            Person obj = it.next();
            System.out.println(obj.getName() + ":" + obj.getAge());
        }
    }

}
