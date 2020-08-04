package day05;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Demo03 {
    @Test
    public void test01() throws IOException {
        File file = new File("a.text");
        file.createNewFile();
        file.delete();
        File file1 = new File("dir");
        file1.delete();
        //创建目录
        //file1.mkdir();
        //创建目录,且将不存在的父目录一起创建
        //file1.mkdirs();
        String[] list = file.list();
        for (String s :list) {
            System.out.println(s);
        }

    }
}
