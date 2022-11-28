package ua.ithillel.podvorchan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BoxFruit<T extends Fruit> {

  private final List<T> fruitBox = new ArrayList<>();

  public void add(T fruit) {
    fruitBox.add(fruit);
  }

  public void addAll(List<T> lotsOfFruits) {
    fruitBox.addAll(lotsOfFruits);
  }

  public float getWeight() {
    float boxWeight = 0.0F;
    for (Fruit fruit : fruitBox) {
      boxWeight += fruit.getWeight();
    }
    return boxWeight;
  }

  public boolean compare(BoxFruit<? extends Fruit> lotsOfFruits) {
    checkOnNull(lotsOfFruits);
    return this.getWeight() == lotsOfFruits.getWeight();
  }

  public void merge(BoxFruit<T> lotsOfFruits) {
    checkOnNull(lotsOfFruits);
    this.fruitBox.addAll(lotsOfFruits.getFruitBox());
  }

  public List<T> getFruitBox() {
    return fruitBox;
  }

  private void checkOnNull(BoxFruit<?> lotsOfFruits) {
    if (Objects.isNull(lotsOfFruits)) {
      throw new IllegalArgumentException("Value is null");
    }
  }

  @Override
  public String toString() {
    return "Box{" +
        "fruitBox=" + fruitBox +
        ", boxWeight=" + getWeight() +
        '}';
  }


}
