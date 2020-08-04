package day02;

public class ExceptionFinallyDemo {
    public static void main(String[] args) {
        int a = m1();
        System.out.println("main中的a = " + a);
    }

    public static int m1() {
        int a = 10;
        try {
            a += 100;
            return a;//先标记return的地方a=110,然后再执行finally,由于标记了a已经是110,所以返回值是110
        } catch (RuntimeException e) {
            System.out.println("异常了异常了异常了");
            return 0;
        } finally {
            a++;
            System.out.println("finally中的a = " + a);
        }
    }
}
