package ua.ithillel.logger.service;

import ua.ithillel.logger.enums.LoggingLevel;

/**
 * @author Podvorchan Ruslan 08.11.2022
 */
public class FileLoggerConfiguration extends LoggerConfiguration {

  private int fileSize = 256;

  public FileLoggerConfiguration() {
  }

  public FileLoggerConfiguration(String fileName, LoggingLevel loggingLevel) {
    super(fileName, loggingLevel);
  }

  public int getFileSize() {
    return fileSize;
  }

  public void setFileSize(int fileSize) {
    if (fileSize < 1) {
      this.fileSize = 256;
      System.out.println("Incorrect file size ");
    }

    this.fileSize = fileSize;
  }

}
