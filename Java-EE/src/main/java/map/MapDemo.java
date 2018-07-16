package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        /**
         *  需求：Map集合中存储学号，姓名
         */
        Map<Integer, String> map = new HashMap<Integer, String>();
        methodDemo(map);
    }

    public static void methodDemo(Map<Integer, String> map) {

        //1. 存储键值对。如果键相同，会出现覆盖
        System.out.println(map.put(3, "XiaoBai"));
        System.out.println(map.put(3, "erhu"));
        map.put(7, "HaoCai");
        map.put(2, "55555");

        //  2. 移除remove  ---->  会改变长度
        System.out.println(map.remove(7));

        //3. 获取
        System.out.println(map.get(7));

        System.out.println(map);

    }

}
