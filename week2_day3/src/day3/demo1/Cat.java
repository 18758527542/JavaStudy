package day3.demo1;

public class Cat implements Animal {
    @Override
    public void sleep() {
        System.out.println("It can sleep!");
    }

    @Override
    public void run() {
        System.out.println("It can run!");
    }
}
