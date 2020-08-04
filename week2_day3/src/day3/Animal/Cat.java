package day3.Animal;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃猫粮！");
    }

    public void catchMouse() {
        System.out.println("猫会抓老鼠！");
    }
}
