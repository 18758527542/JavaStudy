package myAirplaneWar;

public class AirplaneSmall extends FlyingObjects {
    private int speed;

    public AirplaneSmall() {
        super((int) (Math.random() * (Game.WIDTH - Game.airplane.getWidth())), Game.airplane.getHeight(), Game.airplane);
        this.setSpeed(5);
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
