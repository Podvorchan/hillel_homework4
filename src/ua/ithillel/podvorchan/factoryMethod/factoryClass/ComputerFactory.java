package ua.ithillel.podvorchan.factoryMethod.factoryClass;

import ua.ithillel.podvorchan.factoryMethod.superClass.Computer;
import ua.ithillel.podvorchan.factoryMethod.subClass.PC;
import ua.ithillel.podvorchan.factoryMethod.subClass.Server;

/**
 * @author Podvorchan Ruslan 06.11.2022
 */
public class ComputerFactory {

  public static Computer getComputer(String type, String ram, String hdd, String cpu) {
    if ("PC".equalsIgnoreCase(type)) {
      return new PC(ram, hdd, cpu);
    } else if ("Server".equalsIgnoreCase(type)) {
      return new Server(ram, hdd, cpu);
    }

    return null;
  }

}
