package lambda.function_interface;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 余修文
 * @date 2018/9/29 15:54
 */
public class Function_Stream {

    @Test
    public void demo01() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println("-------------------------------");
        Integer value = 50;
        List<Integer> list1 = list.stream().map(Integer -> Integer+1).filter(x -> x > 50).collect(Collectors.toList());
        //List<Integer> list1 = list.stream().filter(x -> x > 50).collect(Collectors.toList());
        System.out.println(list1);
    }

}
