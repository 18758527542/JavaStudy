package day02;

public class ThreadMain2 {
    public static void main(String[] args) {
        MyThread2 task = new MyThread2();
        Thread t = new Thread(task);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main线程中的i : " + i);
        }
    }
}
