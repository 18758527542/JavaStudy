package day03.Picture;

public class Main {
    public static void main(String[] args) {
        Picture picture = new Picture();
        Thread loadAndDownload = new LoadAndDownload(picture);
        Thread show = new ShowPicture(picture);
        loadAndDownload.start();
        show.start();
    }
}
