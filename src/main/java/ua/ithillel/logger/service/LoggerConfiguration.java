package ua.ithillel.logger.service;

import java.util.Date;
import ua.ithillel.logger.enums.LoggingLevel;

/**
 * @author Podvorchan Ruslan 08.11.2022
 */
public class LoggerConfiguration {

  protected String fileName;
  protected LoggingLevel loggingLevel;
  protected Date date = new Date();
  protected String recordingFormat =
      "|" + date + "|" + loggingLevel + "|" + " Message : ";

  public LoggerConfiguration() {
  }

  public LoggerConfiguration(String fileName, LoggingLevel loggingLevel) {
    this.fileName = fileName;
    this.loggingLevel = loggingLevel;
  }

  public void setRecordingFormat(String message, LoggingLevel loggingLevel) {
    this.recordingFormat = "|" + date.toString() + "|" + loggingLevel
        + "|" + " Message : " + message;
  }

}
