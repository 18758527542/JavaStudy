package week02.myAirplaneWar;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Game extends JPanel {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 650;
    public static final int START = 0;
    public static final int RUNNING = 1;
    public static final int PAUSE = 2;
    public static final int GAME_OVER = 3;

    public static BufferedImage background;
    public static BufferedImage start;
    public static BufferedImage pause;
    public static BufferedImage gameover;
    public static BufferedImage hero0;
    public static BufferedImage hero1;
    public static BufferedImage hero_ember0;
    public static BufferedImage hero_ember1;
    public static BufferedImage hero_ember2;
    public static BufferedImage hero_ember3;
    public static BufferedImage bee;
    public static BufferedImage bee_ember0;
    public static BufferedImage bee_ember1;
    public static BufferedImage bee_ember2;
    public static BufferedImage bee_ember3;
    public static BufferedImage airplane;
    public static BufferedImage airplane_ember0;
    public static BufferedImage airplane_ember1;
    public static BufferedImage airplane_ember2;
    public static BufferedImage airplane_ember3;
    public static BufferedImage bigplane;
    public static BufferedImage bigplane_ember0;
    public static BufferedImage bigplane_ember1;
    public static BufferedImage bigplane_ember2;
    public static BufferedImage bigplane_ember3;
    public static BufferedImage extraplane_hit;
    public static BufferedImage extraplane_n1;
    public static BufferedImage extraplane_n2;
    public static BufferedImage extraplane_ember0;
    public static BufferedImage extraplane_ember1;
    public static BufferedImage extraplane_ember2;
    public static BufferedImage extraplane_ember3;
    public static BufferedImage extraplane_ember4;
    public static BufferedImage extraplane_ember5;
    public static BufferedImage bullet;

    static {
        try {
            background = ImageIO.read(Game.class.getResourceAsStream("image/background.png"));
            start = ImageIO.read(Game.class.getResourceAsStream("image/start.png"));
            pause = ImageIO.read(Game.class.getResourceAsStream("image/pause.png"));
            gameover = ImageIO.read(Game.class.getResourceAsStream("image/gameover.png"));
            hero0 = ImageIO.read(Game.class.getResourceAsStream("image/hero0.png"));
            hero1 = ImageIO.read(Game.class.getResourceAsStream("image/hero1.png"));
            hero_ember0 = ImageIO.read(Game.class.getResourceAsStream("image/hero_ember0.png"));
            hero_ember1 = ImageIO.read(Game.class.getResourceAsStream("image/hero_ember1.png"));
            hero_ember2 = ImageIO.read(Game.class.getResourceAsStream("image/hero_ember2.png"));
            hero_ember3 = ImageIO.read(Game.class.getResourceAsStream("image/hero_ember3.png"));
            bee = ImageIO.read(Game.class.getResourceAsStream("image/bee.png"));
            bee_ember0 = ImageIO.read(Game.class.getResourceAsStream("image/bee_ember0.png"));
            bee_ember1 = ImageIO.read(Game.class.getResourceAsStream("image/bee_ember1.png"));
            bee_ember2 = ImageIO.read(Game.class.getResourceAsStream("image/bee_ember2.png"));
            bee_ember3 = ImageIO.read(Game.class.getResourceAsStream("image/bee_ember3.png"));
            airplane = ImageIO.read(Game.class.getResourceAsStream("image/airplane.png"));
            airplane_ember0 = ImageIO.read(Game.class.getResourceAsStream("image/airplane_ember0.png"));
            airplane_ember1 = ImageIO.read(Game.class.getResourceAsStream("image/airplane_ember1.png"));
            airplane_ember2 = ImageIO.read(Game.class.getResourceAsStream("image/airplane_ember2.png"));
            airplane_ember3 = ImageIO.read(Game.class.getResourceAsStream("image/airplane_ember3.png"));
            bigplane = ImageIO.read(Game.class.getResourceAsStream("image/bigplane.png"));
            bigplane_ember0 = ImageIO.read(Game.class.getResourceAsStream("image/bigplane_ember0.png"));
            bigplane_ember1 = ImageIO.read(Game.class.getResourceAsStream("image/bigplane_ember1.png"));
            bigplane_ember2 = ImageIO.read(Game.class.getResourceAsStream("image/bigplane_ember2.png"));
            bigplane_ember3 = ImageIO.read(Game.class.getResourceAsStream("image/bigplane_ember3.png"));
            extraplane_hit = ImageIO.read(Game.class.getResourceAsStream("image/extraplane_hit.png"));
            extraplane_n1 = ImageIO.read(Game.class.getResourceAsStream("image/extraplane_n1.png"));
            extraplane_n2 = ImageIO.read(Game.class.getResourceAsStream("image/extraplane_n2.png"));
            extraplane_ember0 = ImageIO.read(Game.class.getResourceAsStream("image/extraplane_ember0.png"));
            extraplane_ember1 = ImageIO.read(Game.class.getResourceAsStream("image/extraplane_ember1.png"));
            extraplane_ember2 = ImageIO.read(Game.class.getResourceAsStream("image/extraplane_ember2.png"));
            extraplane_ember3 = ImageIO.read(Game.class.getResourceAsStream("image/extraplane_ember3.png"));
            extraplane_ember4 = ImageIO.read(Game.class.getResourceAsStream("image/extraplane_ember4.png"));
            extraplane_ember5 = ImageIO.read(Game.class.getResourceAsStream("image/extraplane_ember5.png"));
            bullet = ImageIO.read(Game.class.getResourceAsStream("image/bullet.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Hero hero = new Hero();
    Bee createBee = new Bee();
    AirplaneSmall createAirplaneSmall = new AirplaneSmall();
    AirplaneBig createAirplaneBig = new AirplaneBig();
    Bullet createBullet = new Bullet(hero.getX() + Game.hero0.getWidth() / 2 - Game.bullet.getWidth()/2, hero.getY() - Game.bullet.getHeight());


    //重写画板
    @Override
    public void paint(Graphics g) {
        super.paint(g);//会清空画板
        g.drawImage(Game.background, 0, 0, this);
        g.setFont(new Font("微软雅黑", Font.ITALIC, 20));
        g.drawString("Score:" + hero.getScore(), 20, 25);
        g.drawString("HP:" + hero.getLife(), 20, 50);

        g.drawImage(hero.getImage(), hero.getX(), hero.getY(), this);
        g.drawImage(createBee.getImage(), createBee.getX(), createBee.getY(), this);
        g.drawImage(createAirplaneSmall.getImage(), createAirplaneSmall.getX(), createAirplaneSmall.getY(), this);
        g.drawImage(createAirplaneBig.getImage(), createAirplaneBig.getX(), createAirplaneBig.getY(), this);
        g.drawImage(createBullet.getImage(), createBullet.getX(), createBullet.getY(), this);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("飞机大战");
        Game myPanel = new Game();

        window.setSize(Game.WIDTH, Game.HEIGHT);//设置窗口宽高
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置点击关闭时候的动作
        window.setLocationRelativeTo(null);//设置窗口居中
        window.setAlwaysOnTop(true);//设置窗口始终置顶
        window.setResizable(false);//设置窗口不可改变大小

        window.add(myPanel);

        window.setVisible(true);//设置窗口可见
    }
}
