package day05;

import org.junit.Test;

import java.io.*;

public class Demo05 {
    @Test
    public void test01() throws IOException {
        //a.txt现在不存在
        /*
        如果文件不存在,会创建新的文件,然后再写入内容
        如果文件存在,会清空原来的内容,然后再写入
         */
        OutputStream os = new FileOutputStream("src/day05/a.txt");
        //以字节为单位写入
        os.write(228);
        os.write(189);
        os.write(160);
        os.write(97);
        os.write(127);
        os.write(256);
        os.write(-1);
    }

    @Test
    public void test02() throws IOException {
        InputStream is = new FileInputStream("src/day05/a.txt");
        //读一个字节 8位 放入int的 32位中的低8位,其他位置全都补0
        int i;
        while ((i = is.read()) != -1) {
            System.out.println("i:" + i);
        }
    }
}
