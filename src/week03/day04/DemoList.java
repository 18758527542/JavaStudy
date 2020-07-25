package week03.day04;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("???");
        list1.add("!!!");
        list.add("hehe");
        list.add("heihei");
        list.add("xixi");
        list.add("hiahia");
        System.out.println(list);
//        list.remove(2);
//        list.add(2, "hoho");
        list.set(2,"hoho");
        System.out.println(list);
        list.addAll(0, list1);
        System.out.println(list);
        System.out.println(list.indexOf("heihei"));
    }
}
