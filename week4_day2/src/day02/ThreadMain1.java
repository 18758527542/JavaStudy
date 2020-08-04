package day02;

public class ThreadMain1 {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        thread1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main中的i : " + i);
        }
    }
}
