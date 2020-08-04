package airplaneWar;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TimerTask;

public class Main extends JPanel {
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

    static {//静态代码块
        try {
            background = ImageIO.read(Main.class.getResourceAsStream("image/background.png"));
            start = ImageIO.read(Main.class.getResourceAsStream("image/start.png"));
            pause = ImageIO.read(Main.class.getResourceAsStream("image/pause.png"));
            gameover = ImageIO.read(Main.class.getResourceAsStream("image/gameover.png"));
            hero0 = ImageIO.read(Main.class.getResourceAsStream("image/hero0.png"));
            hero1 = ImageIO.read(Main.class.getResourceAsStream("image/hero1.png"));
            hero_ember0 = ImageIO.read(Main.class.getResourceAsStream("image/hero_ember0.png"));
            hero_ember1 = ImageIO.read(Main.class.getResourceAsStream("image/hero_ember1.png"));
            hero_ember2 = ImageIO.read(Main.class.getResourceAsStream("image/hero_ember2.png"));
            hero_ember3 = ImageIO.read(Main.class.getResourceAsStream("image/hero_ember3.png"));
            bee = ImageIO.read(Main.class.getResourceAsStream("image/bee.png"));
            bee_ember0 = ImageIO.read(Main.class.getResourceAsStream("image/bee_ember0.png"));
            bee_ember1 = ImageIO.read(Main.class.getResourceAsStream("image/bee_ember1.png"));
            bee_ember2 = ImageIO.read(Main.class.getResourceAsStream("image/bee_ember2.png"));
            bee_ember3 = ImageIO.read(Main.class.getResourceAsStream("image/bee_ember3.png"));
            airplane = ImageIO.read(Main.class.getResourceAsStream("image/airplane.png"));
            airplane_ember0 = ImageIO.read(Main.class.getResourceAsStream("image/airplane_ember0.png"));
            airplane_ember1 = ImageIO.read(Main.class.getResourceAsStream("image/airplane_ember1.png"));
            airplane_ember2 = ImageIO.read(Main.class.getResourceAsStream("image/airplane_ember2.png"));
            airplane_ember3 = ImageIO.read(Main.class.getResourceAsStream("image/airplane_ember3.png"));
            bigplane = ImageIO.read(Main.class.getResourceAsStream("image/bigplane.png"));
            bigplane_ember0 = ImageIO.read(Main.class.getResourceAsStream("image/bigplane_ember0.png"));
            bigplane_ember1 = ImageIO.read(Main.class.getResourceAsStream("image/bigplane_ember1.png"));
            bigplane_ember2 = ImageIO.read(Main.class.getResourceAsStream("image/bigplane_ember2.png"));
            bigplane_ember3 = ImageIO.read(Main.class.getResourceAsStream("image/bigplane_ember3.png"));
            extraplane_hit = ImageIO.read(Main.class.getResourceAsStream("image/extraplane_hit.png"));
            extraplane_n1 = ImageIO.read(Main.class.getResourceAsStream("image/extraplane_n1.png"));
            extraplane_n2 = ImageIO.read(Main.class.getResourceAsStream("image/extraplane_n2.png"));
            extraplane_ember0 = ImageIO.read(Main.class.getResourceAsStream("image/extraplane_ember0.png"));
            extraplane_ember1 = ImageIO.read(Main.class.getResourceAsStream("image/extraplane_ember1.png"));
            extraplane_ember2 = ImageIO.read(Main.class.getResourceAsStream("image/extraplane_ember2.png"));
            extraplane_ember3 = ImageIO.read(Main.class.getResourceAsStream("image/extraplane_ember3.png"));
            extraplane_ember4 = ImageIO.read(Main.class.getResourceAsStream("image/extraplane_ember4.png"));
            extraplane_ember5 = ImageIO.read(Main.class.getResourceAsStream("image/extraplane_ember5.png"));
            bullet = ImageIO.read(Main.class.getResourceAsStream("image/bullet.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //存放所有飞行物的列表
    private static ArrayList<FlyingObjects> flyingObjects;
    //存放所有的子弹
    private static ArrayList<Bullet> bullets;
    private final int START = 0;
    private final int RUNNING = 1;
    private final int PAUSE = 2;
    private final int GAME_OVER = 3;
    private int state = START;

    public Main() {
        flyingObjects = new ArrayList<>();
        bullets = new ArrayList<>();
    }


    Hero hero_move = new Hero();
    int x = hero_move.getX() + Main.hero0.getWidth() / 2 - Main.bullet.getWidth() / 2;
    int y = hero_move.getY() - Main.bullet.getHeight() - 5;
    Bullet bullet_move = new Bullet(x, y);

    public void action() {
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (state == RUNNING) {
                    //1.生成新的飞行物（蜜蜂，小敌机，大敌机）
                    //2.飞行物的移动
                    createFlyingObject();
                    moveFlyingObjects();

                    createBullets();
                    //子弹的移动
                    moveBullet();
                    hit();
                    //3.判断飞行物的越界
                    outBoundAction();
                }
                hero_move.move();//英雄机动作
                repaint();
            }
        }, 0, 20);
        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (state == START) {
                    state = RUNNING;
                } else if (state == GAME_OVER) {
                    state = START;
                }
                repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (state == PAUSE) state = RUNNING;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (state == RUNNING) state = PAUSE;
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                if (state == RUNNING) {
                    //根据鼠标位置，改变飞机的坐标
                    int mouse_x = e.getX();
                    int mouse_y = e.getY();
                    hero_move.setX(mouse_x - Main.hero0.getWidth() / 2);
                    hero_move.setY(mouse_y - Main.hero0.getHeight() / 2);
                    repaint();
                }
            }
        };
        this.addMouseListener(adapter);
        this.addMouseMotionListener(adapter);
    }

    //生成新的飞行物(小敌机，大敌机，蜜蜂，自己的子弹)
    //控制频率
    private int flyingIndex = 0;

    public void createFlyingObject() {
        flyingIndex++;
        if (flyingIndex % 25 == 0) {
            int ran = (int) (Math.random() * 15);
            FlyingObjects fly;
            if (ran == 0) {
                fly = new Bee();
            } else if (ran == 1 || ran == 2) {
                fly = new BigAirplane();
            } else {
                fly = new SmallAirplane();
            }
            flyingObjects.add(fly);
        }
    }

    //飞行物的移动
    public void moveFlyingObjects() {
        for (int i = 0; i < flyingObjects.size(); i++) {
            FlyingObjects fly = flyingObjects.get(i);
            fly.move();
        }
    }

    public void createBullets() {
        if (flyingIndex % 5 == 0) {
            Bullet[] bs = hero_move.shoot();
            for (int i = 0; i < bs.length; i++) {
                bullets.add(bs[i]);
            }
        }
    }

    public void outBoundAction() {
        for (int i = 0; i < flyingObjects.size(); i++) {
            FlyingObjects fly = flyingObjects.get(i);
            if (fly.getY() >= HEIGHT) {
                flyingObjects.remove(i);
                i--;
            }
        }
        for (int i = 0; i < bullets.size(); i++) {
            FlyingObjects fly = bullets.get(i);
            if (fly.getY() <= 0) {
                bullets.remove(i);
                i--;
            }
        }
    }

    //判断相撞
    void hit() {
        for (int i = 0; i < flyingObjects.size(); i++) {
            for (int j = 0; j < bullets.size(); j++) {
                boolean hit = bullets.get(j).getX() >= flyingObjects.get(i).getX()
                        && bullets.get(j).getX() <= flyingObjects.get(i).getX() + Main.airplane.getWidth()
                        && bullets.get(j).getY() <= flyingObjects.get(i).getY() + Main.airplane.getHeight()
                        && bullets.get(j).getY() >= flyingObjects.get(i).getY();
                if (hit) {
                    bullets.remove(j);
                    j--;
                    flyingObjects.get(i).setLife(flyingObjects.get(i).getLife() - 1);
                    if (flyingObjects.get(i).getLife() < 1) {
                        hero_move.setScore(hero_move.getScore() + 10);
                        flyingObjects.remove(i);
                        break;
                    }
                }
            }
        }
    }


    public void moveBullet() {
        for (int i = 0; i < bullets.size(); i++) {
            Bullet fly = bullets.get(i);
            fly.move();
        }
    }

    void paintFlyings(Graphics g) {
        for (int i = 0; i < flyingObjects.size(); i++) {
            FlyingObjects flying = flyingObjects.get(i);
            g.drawImage(flying.getImg(), flying.getX(), flying.getY(), this);
        }
    }

    void paintBullets(Graphics g) {
        for (int i = 0; i < bullets.size(); i++) {
            FlyingObjects flying = bullets.get(i);
            g.drawImage(flying.getImg(), flying.getX(), flying.getY(), this);
        }
    }

    void paintScore(Graphics g) {
        Font font = new Font("微软雅黑", Font.BOLD, 20);
        g.setFont(font);
        g.setColor(Color.red);
        g.drawString("Score:" + hero_move.getScore(), 10, 20);
        g.drawString("HP:" + hero_move.getLife(), 10, 45);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(Main.background, 0, 0, this);
        g.drawImage(hero_move.getImg(), hero_move.getX(), hero_move.getY(), this);
        if (state == START) {
            g.drawImage(Main.start, 0, 0, this);
        } else if (state == PAUSE) {
            g.drawImage(Main.pause, 0, 0, this);
        } else if (state == GAME_OVER) {
            g.drawImage(Main.gameover, 0, 0, this);
        } else {

            paintFlyings(g);
            paintBullets(g);
            //左上角的分数和生命值
            paintScore(g);
        }
    }

    public static int WIDTH = 400;
    public static int HEIGHT = 650;

    public static void main(String[] args) {
        JFrame window = new JFrame("飞机大战");
        window.setSize(WIDTH, HEIGHT);
        window.setResizable(false);//设置窗口大小不可更改
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置点击关闭时的操作
        window.setLocationRelativeTo(null);
        window.setAlwaysOnTop(true);//设置窗口始终置顶

        //调用父类的无参构造器，再调用Main的无参构造器
        Main myPanel = new Main();
        window.add(myPanel);
        myPanel.action();
        window.setVisible(true);//设置窗口可见
    }
}
