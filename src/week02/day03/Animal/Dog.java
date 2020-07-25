package week02.day03.Animal;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃狗粮！");
    }

    public void watchHouse() {
        System.out.println("狗会看家！");
    }
}
