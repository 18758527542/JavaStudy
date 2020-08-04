package day04.baozi;

public class ChiHuo extends Thread {
    public BaoZi baozi;

    public ChiHuo(String name, BaoZi baozi) {
        super(name);
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true) {
            if (!baozi.hasBaoZi) { // 没包⼦
                synchronized (baozi) {
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("吃货吃掉了" + baozi.pi + baozi.xian + "包⼦");
            baozi.hasBaoZi = false;
            synchronized (baozi) {
                baozi.notify();
            }
        }
    }
}
