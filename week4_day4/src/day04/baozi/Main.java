package day04.baozi;

public class Main {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        ChiHuo chiHuo = new ChiHuo("吃货", baoZi);
        //ChiHuo chiHuo1 = new ChiHuo("李四", baoZi);
        BaoZiPu baoZiPu = new BaoZiPu("包子铺", baoZi);
        chiHuo.start();
        //chiHuo1.start();
        baoZiPu.start();
    }
}
