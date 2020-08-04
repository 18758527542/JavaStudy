package day01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("张三", "12345");
        map.put("李四", "543210");
        map.put("王五", "67890");
        map.put("赵六", "98765");
        /*
        Set<String> set = map.keySet();
        for (String key : set) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
         */

        /*
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> en : set) {
            //获得key
            String key = en.getKey();
            String value = en.getValue();
            System.out.println(key + " = " + value);
        }
         */
    }
}
