package week02.airplaneWar;

public class Bullet extends FlyingObjects {
    private int speed;

    public Bullet(int x, int y) {
        super(x, y, Main.bullet,1);
        this.setLife(1);
        speed = 10;
    }

    @Override
    public void move() {
        this.setY(this.getY() - speed);
    }
}
