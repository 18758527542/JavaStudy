package day05;

import org.junit.Test;

public class Demo02 {
    @Test
    public void test01() {
        //在Demo02这个字节码文件所在的文件夹下
        String path = Demo02.class.getResource("a.txt").getPath();
        System.out.println(path);
    }

    @Test
    public void test02() {
        //编译前在C:/WorkSpace/IDEA/JavaStudy/a.txt(和src在同一个文件夹下)
        //编译后在C:/WorkSpace/IDEA/JavaStudy/out/production/JavaStudy/a.txt
        String path = Demo02.class.getClassLoader().getResource("a.txt").getPath();
        System.out.println(path);
    }
}
