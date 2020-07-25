package week03.day04;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Zifuji {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String name = "你好";
        byte[] bs1 = name.getBytes();
        System.out.println(Arrays.toString(bs1));
        String s1 = new String(bs1);
        System.out.println("s1 " + s1);

        byte[] bs2 = name.getBytes("GBK");
        System.out.println(Arrays.toString(bs2));
        String s2 = new String(bs2);
        System.out.println("s2 " + s2);
        String s3 = new String(bs2, "GBK");
        System.out.println("s3 " + s3);
    }
}
