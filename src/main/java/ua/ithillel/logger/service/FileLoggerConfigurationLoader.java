package ua.ithillel.logger.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.Properties;
import ua.ithillel.logger.api.ConfigurationLoader;
import ua.ithillel.logger.enums.LoggingLevel;
import ua.ithillel.logger.enums.PropertiesForFile;

/**
 * @author Podvorchan Ruslan 08.11.2022
 */
public class FileLoggerConfigurationLoader implements ConfigurationLoader {

  private FileLoggerConfiguration loader() {
    FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration();

    try (InputStream input = new FileInputStream
        ("src/ua/ithillel/resourse/logConfig.properties")) {

      Properties properties = new Properties();

      properties.load(input);

      fileLoggerConfiguration.fileName = properties.getProperty(
          String.valueOf(PropertiesForFile.FILE));

      fileLoggerConfiguration.loggingLevel = LoggingLevel.valueOf(properties.getProperty(
          String.valueOf(PropertiesForFile.LEVEL)));

      fileLoggerConfiguration.setFileSize(Integer.parseInt(properties.getProperty(
          String.valueOf(PropertiesForFile.MAX_SIZE))));

      String template = properties.getProperty(String.valueOf(PropertiesForFile.FORMAT));

      fileLoggerConfiguration.recordingFormat = String.format(template, LocalDateTime.now(),
          fileLoggerConfiguration.loggingLevel);


    } catch (IOException ex) {
      ex.printStackTrace();
    }

    return fileLoggerConfiguration;
  }

  public FileLoggerConfiguration load() {
    return loader();
  }

}
