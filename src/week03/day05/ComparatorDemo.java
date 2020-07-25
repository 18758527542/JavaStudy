package week03.day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Jack", 20);
        Student student2 = new Student("Alice", 21);
        Student student3 = new Student("Jackson", 20);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
        System.out.println(students);
    }
}
