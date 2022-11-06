package ua.ithillel.podvorchan.abstractFactory;

import ua.ithillel.podvorchan.abstractFactory.consumer.ComputerFactory;
import ua.ithillel.podvorchan.abstractFactory.factoryClass.PCFactory;
import ua.ithillel.podvorchan.abstractFactory.factoryClass.ServerFactory;
import ua.ithillel.podvorchan.abstractFactory.superClass.Computer;

/**
 * @author Podvorchan Ruslan 06.11.2022
 */
public class Main {

  public static void main(String[] args) {
    Computer pc = ComputerFactory.getComputer(new PCFactory("16GB", "512GB", "4.2Ghz"));
    Computer server = ComputerFactory.getComputer(new ServerFactory("32GB", "10TB", "5.0Ghz"));
    System.out.println("Factory PC Config  " + pc);
    System.out.println("Factory Server Config  " + server);
  }
}

