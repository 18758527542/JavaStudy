package week03.day02;

import java.util.Date;
import java.util.Objects;

public class ToStringDemo {
    public static void main(String[] args) {
        ZiEquals zi1 = new ZiEquals("张三", 15);
        ZiEquals zi2 = new ZiEquals("张三", 20);

        boolean b = zi1.equals(zi2);
        System.out.println(b);
        boolean b2 = Objects.equals(zi1, zi2);
        System.out.println(b2);
    }
}
