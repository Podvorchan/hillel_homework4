package ua.ithillel.podvorchan.abstractFactory.superClass;

/**
 * @author Podvorchan Ruslan 06.11.2022
 */
public abstract class Computer {

  public abstract String getRam();

  public abstract String getHdd();

  public abstract String getCPU();

  @Override
  public String toString() {
    return "RAM : " + this.getRam() + "  HDD : " + this.getHdd() + "  CPU : " + this.getCPU();

  }

}
