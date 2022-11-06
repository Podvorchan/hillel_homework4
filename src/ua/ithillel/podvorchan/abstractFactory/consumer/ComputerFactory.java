package ua.ithillel.podvorchan.abstractFactory.consumer;

import ua.ithillel.podvorchan.abstractFactory.api.ComputerAbstractFactory;
import ua.ithillel.podvorchan.abstractFactory.superClass.Computer;

/**
 * @author Podvorchan Ruslan 06.11.2022
 */
public class ComputerFactory {

  public static Computer getComputer(ComputerAbstractFactory factory) {
    return factory.createComputer();
  }

}
