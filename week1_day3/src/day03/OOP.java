package day03;

public class OOP {
    public static void main(String[] args) {
        Person p = new Person();
        Car newCar = new Car();
        newCar.name = "��ʱ��";
        newCar.color = "��ɫ";
        p.car = newCar;
        System.out.println(p.car.color);
        p.name = "���Ƿ�";
        p.age = 20;
        p.sex = "��";
        System.out.println(p.name);
        System.out.println(p.age);
        p.study();
    }
}
