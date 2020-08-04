package day3.jingtai;

public class Outer {
    int a = 10;//外部类的成员变量
    static int b = 20;//外部类的静态成员变量

    public void m1() {
        System.out.println(a);
    }

    //静态内部类，属于类的
    public static class Inner {
        public void m3() {
            //不能使用非静态成员
            //System.out.println(a);
            System.out.println(b);
        }
    }
}
