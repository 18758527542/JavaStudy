package airplaneWar;

public class SmallAirplane extends FlyingObjects implements Enemy {
    private int speed;
    private int score;

    public SmallAirplane() {
        super((int) (Math.random() * (Main.WIDTH - Main.airplane.getWidth())), -Main.airplane.getHeight(), Main.airplane, 1);
        speed = (int) (Math.random() * (2) + 3);
        score = 5;
    }

    @Override
    public void move() {
        this.setY(this.getY() + speed);
    }
}
