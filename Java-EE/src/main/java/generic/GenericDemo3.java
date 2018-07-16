package generic;

import domain.Person;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GenericDemo3 {

    public static void main(String[] args) {

        Set<String> set = new TreeSet<String>();

        set.add("abcd");
        set.add("aa");
        set.add("nba");
        set.add("cba");

        for (String s : set) {
            System.out.println(s);
        }

        //  按照年龄排序
        Set<Person> set1 = new TreeSet<Person>();
        set1.add(new Person("abcd", 20));
        set1.add(new Person("aa", 25));
        set1.add(new Person("nba", 11));
        set1.add(new Person("cba", 60));

        for (Person p : set1) {
            System.out.println(p);
        }

        System.out.println("------------------");

        //  HashSet不重复的实现
        Set<Person> set2 = new HashSet<Person>();
        set2.add(new Person("aa", 26));
        set2.add(new Person("abcd", 20));
        set2.add(new Person("abcd", 20));
        set2.add(new Person("nba", 22));
        set2.add(new Person("nba", 22));
        set2.add(new Person("cba", 24));

        for (Person p : set2) {
            System.out.println(p);
        }

    }

}
