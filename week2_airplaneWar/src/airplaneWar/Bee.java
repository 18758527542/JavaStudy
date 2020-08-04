package airplaneWar;

public class Bee extends FlyingObjects {
    private int y_speed;
    private int x_speed;
    private int score;

    public Bee() {
        super((int) (Math.random() * (Main.WIDTH - Main.bee.getWidth())), -Main.bee.getHeight(), Main.bee, 1);
        x_speed = 3;
        y_speed = 3;
        score = 10;
    }

    @Override
    public void move() {
        this.setX(this.getX() + x_speed);
        this.setY(this.getY() + y_speed);
        if (this.getX() >= (Main.WIDTH - Main.bee.getWidth())) {
            x_speed = -3;
        } else if (this.getX() <= 0) {
            x_speed = 3;
        }
    }
}
