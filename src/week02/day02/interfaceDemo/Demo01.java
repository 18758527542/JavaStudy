package week02.day02.interfaceDemo;

public interface Demo01 {
    //接口不是类，所以不能有构造方法

    //接口中的成员变量
    //只支持是public static final--->命名方法：常量名所有字母都大写，不同单词用 _ 拼接
    //相当于是公开的静态常量，不可以更改
    public static final int I = 10;

    //JDK7只能有公开的抽象方法
    void method01();

    public static void method02() {
        System.out.println(I);
        System.out.println("JDK8才支持的静态的方法");
    }

    //JDK8 默认方法-通常用来做功能拓展
    default void method03() {
        System.out.println("JDK8才支持的默认的方法");
    }

    //JDk9才有的私有的方法
    private void method04() {
        System.out.println("JDK9才支持的私有的方法");
    }
}
