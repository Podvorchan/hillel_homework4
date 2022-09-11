package ua.ithillel.podvorchan.task3;

public class Robot extends Participant {

    public Robot(String name, double maxRun, double maxJump) {
        super(name, maxRun, maxJump);
    }

    @Override
    public boolean run(double distance) {
        if (this.maxRun >= distance) {
            System.out.println("Robot: " + getName() + " passed the obstacle \"Treadmill \"" + " at a distance " + getMaxRun() + " m");
            return true;
        } else {
            System.out.println("Robot: " + getName() + " did not pass the obstacle \"Treadmill \"" + " at a distance " + getMaxRun() + " m");
            System.out.println(getName() + " - Dropped out of competition");
            return false;

        }


    }

    @Override
    public boolean jump(double height) {
        if (this.maxJump >= height) {
            System.out.println("Robot: " + getName() + " passed the obstacle \" Wall \"" + " at a distance " + getMaxJump() + " m");
            return true;
        } else {
            System.out.println("Robot: " + getName() + " did not pass the obstacle \" Wall \"" + " at a distance " + getMaxJump() + " m");
            System.out.println(getName() + " - Dropped out of competition");
            return false;
        }

    }
}
