package ua.ithillel.podvorchan.task3;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {new Human("Ruslan", 2000, 1.3),
                new Cat("Vasya", 1000, 0.6),
                new Robot("WALL-E", 500, 0)};
        Obstacle[] obstacles = {new Wall(1.2), new Treadmill(500)};
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)) {
                    break;
                }
            }
            System.out.println("");
        }
    }
}
