package day3.demo1;

public class Demo1 {
    public void Cat(Animal a) {
        Cat cat = new Cat();
        cat.run();
        cat.sleep();
    }

    //返回值是接口，但是因为接口不能new对象，使用只能返回接口实现类的对象
    public Animal Dog(Animal b) {
        Dog dog = new Dog();
        //dog调用的是哪个方法，具体看传入的对象是哪个实现类
        //因为对象dog是Dog 方法的实现类，所以调用的是Dog类中的run和sleep方法
        dog.run();
        dog.sleep();
        //返回接口类型的对象
        //return dog;
        return new Dog();
    }
}
