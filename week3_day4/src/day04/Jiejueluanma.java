package day04;

import java.io.UnsupportedEncodingException;

public class Jiejueluanma {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "你好";
        byte[] bs = str.getBytes();
        String s = new String(bs, "ISO8859-1");
        System.out.println(s);//乱码ä½ å¥½

//        byte[] b = s.getBytes("ISO8859-1");
//        s = new String(b, "UTF-8");
//        System.out.println(s);
        s = new String(s.getBytes("ISO8859-1"), "UTF-8");
        System.out.println(s);
    }
}
