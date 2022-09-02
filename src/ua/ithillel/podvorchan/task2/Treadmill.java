package ua.ithillel.podvorchan.task2;

public class Treadmill extends Obstacle{
    private final String name;
    private final double length;

    public Treadmill(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }
}
