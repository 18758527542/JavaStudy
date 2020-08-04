package day03;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new Thread("线程1") {
            @Override
            public void run() {
                Thread t = Thread.currentThread();
                for (int i = 0; i < 10; i++) {
                    System.out.println(t.getName() + ": " + i);
                }
            }
        };
        Runnable run = new Runnable() {
            @Override
            public void run() {
                Thread t = Thread.currentThread();
                for (int i = 0; i < 10; i++) {
                    System.out.println(t.getName() + ": " + i);
                }
            }
        };
        Thread t2 = new Thread(run, "线程2");
        //默认所有的线程的优先级都是5
        //线程的优先级改变的只是调用该线程的概率，并不是一定，优先级数字越大,优先级越高
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        //默认所有的线程都不是守护线程
        //设置守护线程
        //t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
