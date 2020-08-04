package day03.Picture;

public class LoadAndDownload extends Thread {
    Picture picture;

    public LoadAndDownload(Picture picture) {
        this.picture = picture;
    }

    @Override
    public void run() {
        //图片先进入图片加载过程
        System.out.println("图片开始加载...");
        for (int i = 0; i < 100; i++) {
            System.out.println("图片已经加载: " + (i + 1) + "%");
        }
        System.out.println("图片加载完成!");
        picture.isLoad = true;//设置图片加载状态为加载完成
        //图片要开始下载，唤醒正在等待的”显示线程“
        synchronized (picture) {
            picture.notify();
        }
        //等待图片显示完成
        if (!picture.isShow) {
            synchronized (picture) {
                try {
                    picture.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("图片开始下载...");
        for (int i = 0; i < 100; i++) {
            System.out.println("图片已经下载: " + (i + 1) + "%");
        }
        System.out.println("图片下载完成!");
        picture.isShow = true;
    }
}
