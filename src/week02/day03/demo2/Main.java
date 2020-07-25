package week02.day03.demo2;

public class Main {
    public static void main(String[] args) {

        //多态口诀：编译看左边，运行看右边

        Fu f = new Zi();
        f.method1();
        f.method2();
        System.out.println(f.age);
        System.out.println(f.num);

        Zi z = (Zi) f;
        z.method3();
        System.out.println(z.age);
        System.out.println(z.score);
    }
}
