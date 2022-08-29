package ua.ithillel.podvorchan.model;

public class Cat extends Animal {
    private static final int MAX_RUN = 200;
    public static int count;

    public Cat(String name) {
        this.name = name;
        count++;

    }
    public void run(int distance) {
        if (distance <= MAX_RUN) {
            System.out.println(name + " пробежал: " + distance + " метров.");
        } else {
            System.out.println(name + " не может пробежать больше: " + MAX_RUN + " метров.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }
}
