package ua.ithillel.podvorchan;

public abstract class Fruit {

  private final float weight;
  private final String fruit;

  protected Fruit() {
    this.fruit = getClass().getSimpleName();

    this.weight = getWeight();
  }

  public float getWeight() {
    return weight;
  }

  @Override
  public String toString() {
    return "Fruit{" +
        '\'' + fruit + '\'' +
        ", weight=" + weight +
        '}';
  }
}
