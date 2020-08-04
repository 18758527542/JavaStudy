package day02.interfaceDemo;

public class DemoImpl implements Demo {
    //用来实现抽象的方法
    //如果要使用，需要创建这个类的对象
    @Override
    public void Method01() {
        System.out.println("AAAA");
    }
}
