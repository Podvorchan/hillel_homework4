package ua.ithillel.podvorchan.abstractFactory.subClass;

import ua.ithillel.podvorchan.abstractFactory.superClass.Computer;

/**
 * @author Podvorchan Ruslan 06.11.2022
 */
public class PC extends Computer {

  private final String ram;
  private final String hdd;
  private final String cpu;

  public PC(String ram, String hdd, String cpu) {
    this.ram = ram;
    this.hdd = hdd;
    this.cpu = cpu;
  }

  @Override
  public String getRam() {
    return this.ram;
  }

  @Override
  public String getHdd() {
    return this.hdd;
  }

  @Override
  public String getCPU() {
    return this.cpu;
  }


}
