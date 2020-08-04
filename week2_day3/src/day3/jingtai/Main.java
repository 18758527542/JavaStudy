package day3.jingtai;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m1();
        Outer.Inner inner = new Outer.Inner();
        inner.m3();
    }
}
