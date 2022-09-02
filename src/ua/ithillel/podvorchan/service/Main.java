package ua.ithillel.podvorchan.service;

import ua.ithillel.podvorchan.model.Animal;
import ua.ithillel.podvorchan.model.Cat;
import ua.ithillel.podvorchan.model.Dog;

public class Main {
    public static void main(String[] args) {
        Dog bobik=new Dog("Бобик");
        Dog sharik=new Dog("Шарик");
        Cat gosha=new Cat("Гоша");
        bobik.run(25);
        bobik.swim(23);
        sharik.run(145);
        sharik.swim(9);
        gosha.run(140);
        gosha.swim(3);
        System.out.println("Всего животних: "+Animal.count);
        System.out.println("Всего собак: "+Dog.count);
        System.out.println("Всего кошек: "+Cat.count);
       // System.out.println(bobik.getName());
       // System.out.println(gosha.getName());

    }
}
