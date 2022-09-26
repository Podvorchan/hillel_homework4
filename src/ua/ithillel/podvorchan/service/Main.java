package ua.ithillel.podvorchan.service;


import ua.ithillel.podvorchan.FileLogger;
import ua.ithillel.podvorchan.enums.LoggingLevel;

public class Main {

  public static void main(String[] args) {
    FileLogger logger = new FileLogger();

    for (int i = 0; i < 3; i++) {
      logger.debug("Test1");
    }

    logger.setLoggingLevel(LoggingLevel.INFO);
    for (int i = 0; i < 3; i++) {
      logger.debug("Test1");
    }
  }

}


