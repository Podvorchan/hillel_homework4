package ua.ithillel.podvorchan.factoryMethod.subClass;

import ua.ithillel.podvorchan.factoryMethod.superClass.Computer;

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
  public String getRAM() {
    return this.ram;
  }

  @Override
  public String getHDD() {
    return this.hdd;
  }

  @Override
  public String getCPU() {
    return this.cpu;
  }

}
