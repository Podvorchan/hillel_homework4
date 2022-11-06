package ua.ithillel.podvorchan.factoryMethod.superClass;

/**
 * @author Podvorchan Ruslan 06.11.2022
 */
public abstract class Computer {

  public abstract String getRAM();

  public abstract String getHDD();

  public abstract String getCPU();

  @Override
  public String toString() {
    return "RAM : " + this.getRAM() + ", HDD : " + this.getHDD() + ", CPU : " + this.getCPU();
  }

}
