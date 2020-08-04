package day03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    private int ticket = 100;
    Lock lock = new ReentrantLock();

    /*
     * 执⾏卖票操作
     */
    @Override
    public void run() {
        // 每个窗⼝卖票的操作
        // 窗⼝ 永远开启
        while (true) {
            lock.lock();
            if (ticket > 0) { // 有票 可以卖
                // 出票操作
                // 使⽤sleep模拟⼀下出票时间
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 获取当前线程对象的名字
                String name = Thread.currentThread().getName();
                System.out.println(name + "售出1张票!");
                ticket--;
                System.out.println("剩余票数: " + ticket);
            } else {
                throw new RuntimeException("票卖完了!!!");
            }
            lock.unlock();
        }
    }
}