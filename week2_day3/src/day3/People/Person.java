package day3.People;

public class Person {
    private int age = 20;

    public void walk() {
        //外部类想要调用内部类中的数据，必须创建对象
        Heart xin = new Heart();
        System.out.println(xin.num);
    }

    public class Heart {
        int num = 10;
        int age = 18;

        public void beat() {
            int age = 15;
            //age是内部类方法beat内部的age
            System.out.println("心在跳" + age);
            //age是内部类的age
            System.out.println(this.age);
            //age是外部类的age(不用创建对象也能直接使用外部类的成员变量)
            System.out.println(Person.this.age);
        }
    }
}
