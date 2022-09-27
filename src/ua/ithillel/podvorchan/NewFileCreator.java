package ua.ithillel.podvorchan;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewFileCreator {


  static void setNewFileName(FileLoggerConfiguration loggerConfiguration) {
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy-HH.mm.ss");

    loggerConfiguration.fileName = "Log_" + formatter.format(date) + ".txt";


  }

}
