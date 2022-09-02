package ua.ithillel.podvorchan.task1;

public class Main {
    public static void main(String[] args) {
        Areaable[] figures = new Areaable[3];
        figures[0] = new Circle(15);
        figures[1] = new Triangle(4, 4, 6);
        figures[2] = new Square(16);
        System.out.println(sumArea(figures));
    }

    public static double sumArea(Areaable[] figures) {
        double summa = 0.0;
        for (Areaable figure : figures) summa += figure.area();
        return summa;
    }

}

