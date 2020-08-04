package day03;

public class PictureLoadDemo {
    public static void main(String[] args) {
        Runnable loadPicture = new Thread() {
            @Override
            public void run() {
                System.out.println("图片开始加载...");
                for (int i = 0; i < 100; i++) {
                    System.out.println("图片已经加载:" + (i + 1) + "%");
                }
            }
        };
        Thread load = new Thread(loadPicture);
        Runnable showPicture = new Thread() {
            @Override
            public void run() {
                System.out.println("等待图片加载完成...");
                try {
                    load.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("图片显示成功!");
            }
        };
        Thread show = new Thread(showPicture);
        load.start();
        show.start();
    }
}
