package week02.day02.test01;

import week02.day02.Test;

/*
 * 父子类（但是不同包）
*/
public class Test01 extends Test {
    public Test01() {
        super();
    }

    public static void main(String[] args) {
        Test01 t = new Test01();
        t.print();
    }

    public void print() {
        //System.out.println(t.a);//private
        //System.out.println(t.b);//default
        System.out.println(c);//protect
        System.out.println(d);//public

        System.out.println(getA());
        setA(100);
        System.out.println(getA());
    }


}
