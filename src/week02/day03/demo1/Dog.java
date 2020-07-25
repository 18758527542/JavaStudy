package week02.day03.demo1;

public class Dog implements Animal {
    @Override
    public void sleep() {
        System.out.println("It can not sleep!");
    }

    @Override
    public void run() {
        System.out.println("It can not run!");
    }
}
