package day02.interfaceDemo;

public interface Demo {
    int NUM = 0;

    void Method01();

    //默认的方法（可以被重写）
    default void Method02(){
        Method04();
    }

    static void Method03() {
        System.out.println("这是静态的方法！");
        Method05();
    }

    //私有的方法
    private void Method04() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

    //私有的静态方法
    private static void Method05() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
