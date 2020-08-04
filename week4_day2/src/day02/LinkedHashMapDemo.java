package day02;

import java.util.LinkedHashMap;
import java.util.Map;

//也是有序的，但是是按照插入的顺序进行排序
//不能传比较器
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("tom", 20);
        map.put("lucy", 30);
        map.put("jack", 40);
        map.put("jason", 50);
        map.put("luzhishen", 60);
        System.out.println(map);
    }
}
