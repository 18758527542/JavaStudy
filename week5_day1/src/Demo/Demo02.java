package Demo;

import org.junit.Test;

import java.io.*;

public class Demo02 {
    @Test
    public void test01() throws IOException {
        Writer w = new OutputStreamWriter(new FileOutputStream("src/week05/day01/b.txt"));
        char[] ch = {'a', 'b', 's', 't', 'r', 'a', 'c', 't'};
        w.write(ch);
        w.write('\n');
        w.write("public");
//        w.write(-1);
        w.close();
    }

    @Test
    public void test02() throws IOException {
        Reader r = new InputStreamReader(new FileInputStream("src/week05/day01/b.txt"));
        char[] chars = new char[20];
        System.out.println(r.read(chars));
    }

    @Test
    public void test03() throws IOException {
        PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(
                        new FileOutputStream("src/week05/day01/b.txt", true), "gbk"), true);
        pw.print("哈哈哈");
        pw.println("笑个屁");
    }
}
