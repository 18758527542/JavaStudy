package day05;

import org.junit.Test;

import java.io.File;

public class Demo01 {
    @Test
    public void test01() {
        File file = new File("a.txt");
        System.out.println(file);
        File file1 = new File("b/c", "b.txt");
        System.out.println(file1);
        File file2 = new File("C:/WorkSpace/IDEA/JavaStudy/a.txt");

        String path = file.getAbsolutePath();
        String path1 = file1.getAbsolutePath();
        String path2 = file2.getAbsolutePath();

        System.out.println(path);
        System.out.println(path1);
        System.out.println(path2);
    }
}
