package ua.ithillel.podvorchan.task3;

public abstract class Participant {

    protected String name;
    protected double maxRun;
    protected double maxJump;


    protected Participant(String name, double maxRun, double maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }


    public abstract boolean run(double distance);

    public abstract boolean jump(double height);


    public String getName() {
        return name;
    }

    public double getMaxRun() {
        return maxRun;
    }

    public double getMaxJump() {
        return maxJump;
    }
}



