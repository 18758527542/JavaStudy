package myAirplaneWar;

public class AirplaneBig extends FlyingObjects {
    private int speed;

    public AirplaneBig() {
        super((int) (Math.random() * (Game.WIDTH - Game.bigplane.getWidth())), Game.bigplane.getHeight(), Game.bigplane);
        this.setSpeed(2);
    }

    @Override
    public void move() {
        this.setY(this.getY() + this.getSpeed());
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
