package week02.airplaneWar;

import java.awt.image.BufferedImage;

public abstract class FlyingObjects {
    private int x;
    private int y;
    private int width;
    private int height;
    private int life;
    private BufferedImage img;

    protected FlyingObjects(int x, int y, BufferedImage img, int life) {
        this.img = img;
        this.height = getHeight();
        this.width = getWidth();
        this.x = x;
        this.y = y;
        this.life = life;
    }

    public boolean shootByBullet(Bullet b) {
        if (true) {
            return true;
        } else
            return false;
    }

    public abstract void move();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
