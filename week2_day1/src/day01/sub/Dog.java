package day01.sub;

public class Dog extends Animal {
    Dog() {
        //调用父类有参构造方法
        super("");
        System.out.println("Dog空参构造方法");
    }

    Dog(String name) {
        super("");//默认调用父类无参构造方法
        super.name = name;
        this.name = "小强";
        System.out.println("Dog有参构造方法");

    }

    void jiao() {
        System.out.println(name + "在汪汪叫");
    }

    @Override//方法重写
    void eat() {
        System.out.println("??????");
        super.eat();
        System.out.println("??????");
    }

    @Override
    void sleep() {
        System.out.println("干嘛呀？");
    }
}
