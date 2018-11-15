package set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author 余修文
 * @date 2018/11/1 16:13
 */
public class LinkedHashSetDemo01 {

    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(5);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(1);
        //set.stream().forEach(i -> System.out.println(i));
        System.out.println(set.size());
    }

}
