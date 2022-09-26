package ua.ithillel.podvorchan;

import static ua.ithillel.podvorchan.NewFileCreator.setNewFileName;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

import ua.ithillel.podvorchan.api.Loggable;
import ua.ithillel.podvorchan.enums.LoggingLevel;
import ua.ithillel.podvorchan.exception.FileMaxSizeReachedException;


public class FileLogger implements Loggable {

  private static FileLoggerConfiguration loggerConfiguration =
      new FileLoggerConfiguration("log.txt", LoggingLevel.DEBUG);

  private static void writerToFile(String message,LoggingLevel loggingLevel) {

    loggerConfiguration.setRecordingFormat(message,loggingLevel);

    String fullReport = loggerConfiguration.recordingFormat;

    try {
      checkBytesInFile(fullReport);
    } catch (FileMaxSizeReachedException e) {
      exceptionRecord(e.getMessage());
    }

    try (FileWriter writer = new FileWriter(loggerConfiguration.fileName, true)) {

      writer.write("\n" + fullReport);
      writer.flush();

    } catch (IOException ex) {
      System.out.println(ex.getMessage());

    }
  }

  private static void checkBytesInFile(String fullReport) throws FileMaxSizeReachedException {
    File file = new File(loggerConfiguration.fileName);

    if (file.length() + fullReport.length() > loggerConfiguration.getFileSize()) {
      setNewFileName(loggerConfiguration);

      throw new FileMaxSizeReachedException(loggerConfiguration.fileName + " Max size is " +
          loggerConfiguration.getFileSize() + " Size we got " + file.length());
    }
  }

  private static void exceptionRecord(String message) {
    try (FileWriter writer = new FileWriter("exceptions.txt", true)) {

      writer.write("\n" + message);
      writer.flush();

    } catch (IOException ex) {
      System.out.println(ex.getMessage());

    }
  }

  public void debug(String message) {
    if(loggerConfiguration.loggingLevel == LoggingLevel.INFO){
      System.out.println("Set higher logging level");
      return;
    }

    writerToFile(message,LoggingLevel.DEBUG);
  }

  public void info(String message) {
    loggerConfiguration.loggingLevel = LoggingLevel.INFO;
    writerToFile(message,LoggingLevel.INFO);

  }

  public void loadConfiguration() {
    FileLoggerConfigurationLoader fileLoggerConfigurationLoader =
        new FileLoggerConfigurationLoader();
    loggerConfiguration = fileLoggerConfigurationLoader.load();
  }

  public void setLoggingLevel(LoggingLevel loggingLevel){
    loggerConfiguration.loggingLevel = loggingLevel;
  }
}
