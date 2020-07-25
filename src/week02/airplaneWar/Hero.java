package week02.airplaneWar;

import java.awt.image.BufferedImage;

public class Hero extends FlyingObjects {
    private int score;

    public Hero() {
        super(200 - Main.hero0.getWidth() / 2, 600 - Main.hero0.getHeight(), Main.hero0, 5);
        score = 0;
    }

    //
    private int doubleFire = 0;

    public void addDoubleFire() {
        doubleFire += 20;
    }

    private int count = 0;
    private BufferedImage[] herosImg = {Main.hero0, Main.hero0, Main.hero0, Main.hero1, Main.hero1, Main.hero1};

    @Override
    public void move() {
        count++;
        setImg(herosImg[count % 6]);
    }

    //发射子弹，生成新的子弹并返回
    public Bullet[] shoot() {
        Bullet[] bullets;
        //根据英雄机的x和y,来计算子弹的x和y
        if (doubleFire == 0) {
            bullets = new Bullet[1];
            bullets[0] = new Bullet(this.getX() + Main.hero0.getWidth() / 2, this.getY() - this.getHeight());
        } else {
            bullets = new Bullet[2];
            bullets[0] = new Bullet(this.getX() + Main.hero0.getWidth() / 4, this.getY() - this.getHeight());
            bullets[1] = new Bullet(this.getX() + Main.hero0.getWidth() * 3 / 4, this.getY() - this.getHeight());
            doubleFire--;
        }
        return bullets;
    }

    //判断英雄机是否被其他飞机击中
    public boolean shootByFlying(FlyingObjects fly) {
        if (true) {


            return true;
        } else
            return false;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
