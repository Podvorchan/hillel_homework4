package ua.ithillel.podvorchan.abstractFactory.factoryClass;

import ua.ithillel.podvorchan.abstractFactory.api.ComputerAbstractFactory;
import ua.ithillel.podvorchan.abstractFactory.subClass.PC;
import ua.ithillel.podvorchan.abstractFactory.superClass.Computer;

/**
 * @author Podvorchan Ruslan 06.11.2022
 */
public class PCFactory implements ComputerAbstractFactory {

  private final String ram;
  private final String hdd;
  private final String cpu;

  public PCFactory(String ram, String hdd, String cpu) {
    this.ram = ram;
    this.hdd = hdd;
    this.cpu = cpu;
  }

  @Override
  public Computer createComputer() {
    return new PC(ram, hdd, cpu);
  }

}
