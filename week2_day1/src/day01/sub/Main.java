package day01.sub;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Dog dog2=new Dog("newDog");
        dog.name = "张三";
        dog.sex = "母";
        dog.age = 100;
        dog.eat();
        dog.sleep();
        System.out.println(dog.name + "，" + dog.sex + "，" + dog.age);
    }
}
