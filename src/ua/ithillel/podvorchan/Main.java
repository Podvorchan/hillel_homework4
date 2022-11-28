package ua.ithillel.podvorchan;

import java.util.List;

/**
 * @author Podvorchan Ruslan 26.11.2022
 */
public class Main {

  public static void main(String[] args) {
    Apple apple = new Apple();
    Orange orange = new Orange();

    Apple[] manyApples = {apple, apple, apple, apple};
    Orange[] manyOranges = {orange, orange, orange, orange};

    BoxFruit<Apple> appleBox = new BoxFruit<>();
    BoxFruit<Orange> orangeBox = new BoxFruit<>();

    BoxFruit<Apple> appleBox2 = new BoxFruit<>();
    BoxFruit<Orange> orangeBox2 = new BoxFruit<>();

    appleBox.add(apple);
    appleBox.addAll(List.of(manyApples));

    orangeBox.add(orange);
    orangeBox.addAll(List.of(manyOranges));

    System.out.println(appleBox);
    System.out.println(orangeBox);

    System.out.println("Compare fruit boxes: " + appleBox.compare(orangeBox));

    appleBox.merge(appleBox2);
    orangeBox.merge(orangeBox2);

    System.out.println(appleBox);
    System.out.println(orangeBox);
  }

}
