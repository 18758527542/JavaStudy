package day03.Picture;

public class ShowPicture extends Thread {
    Picture picture;

    public ShowPicture(Picture picture) {
        this.picture = picture;
    }

    @Override
    public void run() {
        System.out.println("等待图片加载完成...");
        if (!picture.isLoad) {
            synchronized (picture) {
                try {
                    picture.wait();
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
        System.out.println("图片显示成功!");
        picture.isShow = true;
        synchronized (picture) {
            picture.notify();
        }
    }
}
