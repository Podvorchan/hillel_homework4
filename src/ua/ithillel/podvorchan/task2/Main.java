package ua.ithillel.podvorchan.task2;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = createParticipants();
        Obstacle[] obstacles = createObstacles();

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                participant.overcome(obstacle);
                if (participant.isFailObstacle())
                    break;
            }
            System.out.println();
        }
    }

    private static Obstacle[] createObstacles() {
        Obstacle[] obstacles = new Obstacle[6];

        obstacles[0] = new Wall("Низкая стена", 1.2);
        obstacles[1] = new Treadmill("Короткая дистанция", 100);
        obstacles[2] = new Wall("Средняя стена ", 1.5);
        obstacles[3] = new Treadmill("Средняя дистанция", 1000);
        obstacles[4] = new Wall("Высокая стена", 2.0);
        obstacles[5] = new Treadmill("Длинная дистанция", 3000);

        return obstacles;
    }

    private static Participant[] createParticipants() {
        Participant[] participants = new Participant[9];

        participants[0] = new Human("Ruslan", 4500, 1.6);
        participants[1] = new Human("Sergey", 1000, 1.3);
        participants[2] = new Human("Igor", 90, 0.5);

        participants[3] = new Cat("Mursik", 2000, 1.8);
        participants[4] = new Cat("Barsik", 3000, 1.8);
        participants[5] = new Cat("Vsapogah", 500, 1.4);

        participants[6] = new Robot("Wall", 50, 0);
        participants[7] = new Robot("Finch", 1000, 1.3);
        participants[8] = new Robot("Chappie", 5000, 2.5);

        return participants;
    }

}

