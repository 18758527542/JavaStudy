package day03;

public class ThreadDemo {
    public static void main(String[] args) {
//        MyThread task = new MyThread();
//        Thread t1 = new Thread(task, "线程1");
//        t1.start();
//        Thread t2 = new Thread(task, "线程2");
//        t2.start();

        //匿名内部类
        Thread t3 = new Thread("线程3") {
            @Override
            public void run() {
                Thread t = Thread.currentThread();
                for (int i = 0; i < 10; i++) {
                    System.out.println(t.getName() + ": " + i);
                }
            }
        };
        t3.start();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                Thread t = Thread.currentThread();
                for (int i = 0; i < 10; i++) {
                    System.out.println(t.getName() + ": " + i);
                }
            }
        };
        Thread t4 = new Thread(run, "线程4");
        t4.start();
    }
}
