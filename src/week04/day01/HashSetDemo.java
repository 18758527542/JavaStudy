package week04.day01;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("张三", 20));
        set.add(new Student("李四", 30));
        set.add(new Student("李四", 30));
        set.add(new Student("张三", 20));
        System.out.println(set);
        System.out.println(set.size());
    }
}
