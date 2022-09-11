package ua.ithillel.podvorchan.task3;

public class Treadmill extends Obstacle {

    private final double length;


    public Treadmill(double length) {

        this.length = length;

    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.run(length);

    }

    public double getLength() {
        return length;
    }


}
