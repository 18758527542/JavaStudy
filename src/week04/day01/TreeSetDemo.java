package week04.day01;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return ((Comparable) o1.getName()).compareTo(o2.getName());
            }
        });
        set.add(new Student("jack", 20));
        set.add(new Student("andy", 30));
        set.add(new Student("tom", 40));
        set.add(new Student("lucy", 50));
        set.add(new Student("lucy", 50));
        System.out.println(set);
    }
}
