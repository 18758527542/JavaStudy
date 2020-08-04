package myAirplaneWar;

public class Hero extends FlyingObjects{
    private int score;

    protected Hero() {
        super(Game.WIDTH/2-Game.hero0.getWidth()/2,Game.HEIGHT-Game.hero0.getHeight()-100,Game.hero0);
        this.setScore(0);
        this.setLife(5);
    }

    @Override
    public void move() {

    }

    public  int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
