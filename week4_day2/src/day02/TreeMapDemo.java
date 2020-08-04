package day02;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

//TreeMap是按照key排序好的，有序
//可以传比较器
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        map.put("tom", 20);
        map.put("lucy", 30);
        map.put("jack", 40);
        map.put("jason", 50);
        map.put("luzhishen", 60);
        System.out.println(map);
    }
}