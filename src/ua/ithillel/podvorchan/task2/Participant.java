package ua.ithillel.podvorchan.task2;

abstract class Participant {
    final private String category;
    final private String name;
    final private double maxRun;
    final private double maxJump;
    private boolean isFailObstacle;

    public Participant(String category, String name, double maxRun, double maxJump) {
        this.category = category;
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public boolean isFailObstacle() {
        return isFailObstacle;
    }

    public void overcome(Obstacle obstacle) {
        if (obstacle instanceof Wall) {
            jump((Wall) obstacle);
        } else if (obstacle instanceof Treadmill) {
            run((Treadmill) obstacle);
        }
    }

    private void jump(Wall wall) {
        action(wall.getName(), wall.getHeight(), maxJump);
    }

    private void run(Treadmill track) {

        action(track.getName(), track.getLength(), maxRun);
    }

    private void action(String nameObstacle, double valueObstacle, double max) {
        if (max > valueObstacle) {
            oKResultParticipant(nameObstacle, valueObstacle);
        } else {
            failResultParticipant(nameObstacle, valueObstacle, max);
            isFailObstacle = true;
        }
    }

    private void oKResultParticipant(String obstacleName, double obstacleValue) {
        //  System.out.println(category+name+" преодолел препятствие \""+obstacleName+"\" растояние "+obstacleValue+"m");
        System.out.printf("%s %s преодолел препятствие \"%s\" растояние %.1fm\n", category, name,
                obstacleName, obstacleValue);
    }

    private void failResultParticipant(String obstacleName, double obstacleValue, double max) {
      /* System.out.println(category+name+" не прошел препятствие "+obstacleName+" расстояние "
         +obstacleValue+"m. Преодолено "+max);*/
        System.out.printf("%s %s не прошел препятствие \"%s\" расстояние %.1fm. Преодолено %.1fm\n", category,
                name, obstacleName, obstacleValue, max);
    }
}
