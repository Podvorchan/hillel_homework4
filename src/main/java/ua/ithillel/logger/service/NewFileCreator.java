package ua.ithillel.logger.service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Podvorchan Ruslan 08.11.2022
 */
public class NewFileCreator {

  static void setNewFileName(FileLoggerConfiguration loggerConfiguration) {
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy-HH.mm.ss");

    loggerConfiguration.fileName = "Log_" + formatter.format(date) + ".txt";


  }

}
