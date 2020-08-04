package day04;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        List list = new ArrayList(Arrays.asList("haha", "heihei", "hehe", "tom", "jason"));
        Collections.sort(list, (String o1, String o2) -> {
            return o1.length() - o2.length();
        });
        System.out.println(list);
    }
}
