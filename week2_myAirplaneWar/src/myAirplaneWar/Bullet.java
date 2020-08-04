package myAirplaneWar;

public class Bullet extends FlyingObjects {
    private int speed;

    public Bullet(int x, int y) {
        super(x, y, Game.bullet);
        this.setLife(1);
        this.setSpeed(10);
    }

    @Override
    public void move() {
        this.setY(this.getY()-this.getSpeed());
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
