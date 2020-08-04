package Demo;

import org.junit.Test;

import java.io.*;
import java.util.Arrays;

public class test {
    @Test
    public void test01() throws IOException {
        OutputStream os = new FileOutputStream("src/week05/day01/a.txt");
        String str = "你好,吃了吗?";
        byte[] bs = str.getBytes("gbk");
//        os.write(bs);
        os.write(bs);
        os.write("\r\n".getBytes("gbk"));
        os.write("???".getBytes("gbk"));
        System.out.println(Arrays.toString(bs));
    }
}
