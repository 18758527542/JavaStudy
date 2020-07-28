package week04.day02;

import java.io.IOException;
import java.text.ParseException;

public class ExceptionThrowsDemo {
    public static void main(String[] args) throws ParseException {
        method01();
    }

    private static void method01() throws ParseException {
        try {
            throw new IOException("IO异常是一为什么产生的");
        } catch (IOException e) {
            System.out.println("???");
        }finally {
            System.out.println("!!!");
        }
        throw new ParseException("这是啥异常", 0);
    }
}
