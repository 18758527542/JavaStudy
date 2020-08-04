package myAirplaneWar;

import java.awt.image.BufferedImage;

public abstract class FlyingObjects {
    private int x;
    private int y;
    private int width;
    private int height;
    private int life;
    private BufferedImage image;

    protected FlyingObjects(int x, int y, BufferedImage image) {
        this.image = image;
        this.width = getWidth();
        this.height = getHeight();
        this.x = x;
        this.y = y;
        this.life = getLife();
    }

    protected abstract void move();

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

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
}
