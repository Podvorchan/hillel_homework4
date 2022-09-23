package ua.ithillel.podvorchan;


public class Main {

  public static void main(String[] args) {
    FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration(
        LoggingLevel.DEBUG, (byte) 127,
        "log.txt");
    FileLogger fileLogger = new FileLogger(fileLoggerConfiguration);
    fileLogger.debug("Debug comment.");
    fileLogger.info("Info comment.");
    FileLoggerConfigurationLoader file = new FileLoggerConfigurationLoader();
    FileLoggerConfiguration file1 = file.load("qwerty");
    FileLogger file2 = new FileLogger(file1);
    file2.info("test log");
  }

}


