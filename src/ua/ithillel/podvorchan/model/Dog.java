package ua.ithillel.podvorchan.model;

public class Dog extends Animal {
    private static final int MAX_RUN = 500;
    private static final int MAX_SWIM = 10;
    public static int count;

    public Dog(String name) {
        this.name = name;
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN) {
            System.out.println(name + " пробежал: " + distance + " метров.");
        } else {
            System.out.println(name + " не может пробежать больше: " + MAX_RUN + " метров.");
        }
    }

    @Override
    public void swim(int distance) {

        if (distance <= MAX_SWIM) {
            System.out.println(name + " проплыл: " + distance + " метров.");
        } else {
            System.out.println(name + " не может проплыть больше: " + MAX_SWIM + " метров.");
        }
    }
}
