package day01.sub;

public abstract /*抽象类*/ class Animal {
    String name;
    String sex;
    int age;

    Animal() {
        System.out.println("Animal空参构造方法");
    }

    Animal(String name) {
        System.out.println("Animal有参构造方法");
    }

    void eat() {
        System.out.println(name + "在吃东西！");
    }

    //公共部分，为了让所有的子类都统一
    //父类中的sleep方法并没有任何意义-抽象方法
    abstract void sleep();
}
