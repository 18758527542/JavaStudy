package day3.niming;

public class Main {
    public static void main(String[] args) {
        InterfaceA impl = new InterfaceA() {
            @Override
            public void m1() {
                System.out.println("11111");
            }

            @Override
            public void m2() {
                System.out.println("22222");
            }
        };
        impl.m1();
        impl.m2();
    }
}
