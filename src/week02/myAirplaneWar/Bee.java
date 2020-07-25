package week02.myAirplaneWar;

public class Bee extends FlyingObjects {
    private int speed;

    public Bee() {
        super((int) (Math.random() * (Game.WIDTH - Game.bee.getWidth())), Game.bee.getHeight(), Game.bee);
        this.setSpeed(3);
    }

    @Override
    public void move() {
        this.setY(this.getY() + this.getSpeed());
        this.setX(this.getX() + this.getSpeed());
        if (this.getX() >= Game.WIDTH - this.getWidth()) {
            setSpeed(-getSpeed());
        } else if (this.getX() <= 0) {
            setSpeed(-getSpeed());
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
