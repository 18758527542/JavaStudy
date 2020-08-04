package day05;

import org.junit.Test;

import java.io.File;
import java.util.Arrays;

public class Demo04 {
    @Test
    public void test01() {
        File file = new File(".");
        File[] files = file.listFiles(f -> f.isFile());//只想保留文件,不想保留目录

        System.out.println(Arrays.toString(files));
        File[] files1 = file.listFiles(f -> {
            //只想保留txt文件
            String name = f.getName();
            return name.endsWith(".txt");
        });
        System.out.println(Arrays.toString(files1));
    }

    public static void main(String[] args) {
        File file = new File("dir");
        Demo04 hh = new Demo04();
        hh.deleteFile(file);
    }

    @Test//删除一个文件夹以及文件夹内所有文件
    public void deleteFile(File file) {
        //结束递归的条件:1.file对象本身就是文件;2.file是一个空目录
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                deleteFile(f);
            }
        }
        file.delete();
    }
}
