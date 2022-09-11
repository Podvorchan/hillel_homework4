package ua.ithillel.podvorchan.task3;

public class Wall extends Obstacle {
    private final double height;


    public Wall(double height) {

        this.height = height;
    }

    @Override
    boolean overcome(Participant participant) {
        return participant.jump(height);
    }

    public double getHeight() {
        return height;
    }


}
