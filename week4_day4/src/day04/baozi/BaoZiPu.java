package day04.baozi;

public class BaoZiPu extends Thread {
    BaoZi baozi;
    int count = 0;

    public BaoZiPu(String name, BaoZi baozi) {
        super(name);
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true) {
            //包子存在
            if (baozi.hasBaoZi) {
                synchronized (baozi) {
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            //包子不存在-->做包子
            System.out.println("开始做包子");
            if (count % 2 == 0) {
                // 冰⽪ 五仁
                baozi.pi = "冰⽪";
                baozi.xian = "五仁";
            } else {
                // 薄⽪ ⽜⾁⼤葱
                baozi.pi = "薄⽪";
                baozi.xian = "⽜⾁⼤葱";
            }
            count++;
            baozi.hasBaoZi = true;
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("包⼦做好了：" + baozi.pi + baozi.xian);
            System.out.println("吃货来吃第" + count + "个包子吧");
            // 唤醒等待线程 (吃货)
            synchronized (baozi) {
                baozi.notify();
            }
        }
    }
}
