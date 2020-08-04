package day04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        Runnable task = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(currentThread().getName() + i);
                }
            }
        };
        //创建一个固定线程数量的线程池，创建好线程池的时候，就已经
        ExecutorService pool = Executors.newFixedThreadPool(4);
        //将线程任务交给线程池--线程对象可以反复使用
        pool.submit(task);
        pool.submit(task);
        pool.submit(task);
        pool.submit(task);
        //如果没有关闭线程池，线程对象依旧存在，程序不会停止

        //手动关闭线程池--会自动将李米娜的线程对象销毁
        pool.shutdown();
    }
}
