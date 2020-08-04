package day04;

import org.junit.*;

public class Lambda {
    public static void main(String[] args) {
        System.out.println(method(a -> a * a, 12));
        new Thread(() -> System.out.println("???")).start();
    }

    public static int method(LambdaDemo lambda, int a) {
        return lambda.haha(a);
    }

    @Before
    public void before(){
        System.out.println("hello!!!");
    }
    @After
    public void after(){
        System.out.println("bye!!!");
    }
    @Test
    public void method01(){
        System.out.println("?????");
    }
}
