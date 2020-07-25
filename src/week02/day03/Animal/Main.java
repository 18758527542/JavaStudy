package week02.day03.Animal;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Dog();
        a1.eat();
        a2.eat();
        //强制转换
        Cat g1 = (Cat) a1;
        g1.catchMouse();
        //判断a2是不是狗，如果是狗就执行
        if (a2 instanceof Dog) {
            Dog g2 = (Dog) a2;
            g2.watchHouse();
        }
        giveMePet(new Dog());
        Date date=new Date();
        System.out.println(date);
    }

    //Animal作为返回值类型，这个方法就可以但会多种不同的结果
    public Animal typePet() {
        return null;
    }

    //Animal作为参数，可以传递多种类型的对象
    public static void giveMePet(Animal a) {
        if (a instanceof Cat) {
            ((Cat) a).eat();
            ((Cat) a).catchMouse();
        } else if (a instanceof Dog) {
            ((Dog) a).eat();
            ((Dog) a).watchHouse();
        } else {
            System.out.println("还没有这种宠物");
        }
    }
}
