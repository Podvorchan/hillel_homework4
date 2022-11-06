package ua.ithillel.podvorchan.factoryMethod;

import ua.ithillel.podvorchan.factoryMethod.factoryClass.ComputerFactory;
import ua.ithillel.podvorchan.factoryMethod.superClass.Computer;

/**
 * @author Podvorchan Ruslan 06.11.2022
 */
public class Main {

  public static void main(String[] args) {
    Computer pc = ComputerFactory.getComputer("pc", "16 GB", "512 GB", "4.2 GHz");
    Computer server = ComputerFactory.getComputer("server", "32 GB", "10TB", "5.0 GHz");
    System.out.println("Factory PC Config  " + pc);
    System.out.println("Factory Server Config  " + server);
  }
}


