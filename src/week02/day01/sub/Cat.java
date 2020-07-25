package week02.day01.sub;

public class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void play() {
        System.out.println(name + "在玩球！");
    }

    void sleep() {
        System.out.println("喵喵喵");
    }
}
