package week02.day03.People;

public class Main {
    public static void main(String[] args) {
        Person hu = new Person();
        //间接调用Person中的内部类
        hu.walk();
        //直接调用Person中的Heart内部类
        Person.Heart xin1 = hu.new Heart();
        xin1.beat();
        //如果没有创建Person类，想要直接创建Heart类
        Person.Heart xin2 = new Person().new Heart();
        xin2.beat();
    }
}
