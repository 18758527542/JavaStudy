package day03;

public class SaleMain {
    public static void main(String[] args) {
        Ticket run = new Ticket();
        Thread t1 = new Thread(run, "窗口1");
        Thread t2 = new Thread(run, "窗口2");
        Thread t3 = new Thread(run, "窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
