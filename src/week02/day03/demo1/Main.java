package week02.day03.demo1;

import week01.day03.Car;

public class Main {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        //创建实现类接口对象
        Cat cat = new Cat();
        //参数需要一个Animal类型
        //实际参数：可以是接口的实现类 对象
        d.Cat(cat);

        Dog dog = new Dog();
        //写法错误，返回值的类型规定是Animal
        //Dog re = d.Dog(dog);
        //正确写法
        //调用方法
        Animal re = d.Dog(dog);
    }
}
