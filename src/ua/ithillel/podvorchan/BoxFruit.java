package ua.ithillel.podvorchan;

import java.util.ArrayList;
import java.util.List;

public class BoxFruit<T extends Fruit> {

  private static final float EMPTY = 0.0F;
  private List<T> fruits = new ArrayList<>();

  public List<T> getFruits() {
    return fruits;
  }

  public void add(T fruit) {
    fruits.add(fruit);
  }

  public void addAll(List<T> lotsOfFruits) {
    fruits.addAll(lotsOfFruits);
  }

  public float getWeight() {
    if (fruits.isEmpty()) {
      return EMPTY;
    }
    for (T fruit : fruits) {
      if (fruit != null) {
        return fruit.getWeight() * fruits.size();
      }
    }
    return EMPTY;
  }

  public boolean compare(BoxFruit<? extends Fruit> lotsOfFruits) {
    return getWeight() == lotsOfFruits.getWeight();
  }

  public void merge(BoxFruit<T> lotsOfFruits) {
    fruits.addAll(lotsOfFruits.getFruits());
    lotsOfFruits.getFruits().clear();
  }

}
