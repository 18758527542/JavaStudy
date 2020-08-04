package Demo;

import org.junit.Test;

import java.io.*;

public class Demo01 {
    @Test
    public void test01() {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/week05/day01/a.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/week05/day01/a_bak.txt"))){
            int a;
            long time1 = System.currentTimeMillis();
            while ((a = bis.read()) != -1) {
                bos.write(a ^ 77);
            }
            long time2 = System.currentTimeMillis();
            System.out.println(time2 - time1);
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
