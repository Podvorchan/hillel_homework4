package ua.ithillel.podvorchan.service;


import ua.ithillel.podvorchan.FileLogger;
import ua.ithillel.podvorchan.enums.LoggingLevel;

public class Main {

  public static void main(String[] args) {
    FileLogger logger = new FileLogger();

    logger.debug("test log");

    logger.setLoggingLevel(LoggingLevel.INFO);

    logger.info("test log");
  }
}




