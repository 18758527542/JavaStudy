package week02.airplaneWar;

public class BigAirplane extends FlyingObjects {
    private int speed;
    private int score;

    public BigAirplane() {
        super((int) (Math.random() * (Main.WIDTH - Main.bigplane.getWidth())), -Main.bigplane.getHeight(), Main.bigplane, 5);
        speed = (int) (Math.random() * 2 + 2);
        score = 15;
    }

    @Override
    public void move() {
        this.setY(this.getY() + speed);
    }
}
