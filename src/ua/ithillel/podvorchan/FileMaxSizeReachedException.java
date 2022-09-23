package ua.ithillel.podvorchan;

import java.io.IOException;

public class FileMaxSizeReachedException extends Throwable {

  public FileMaxSizeReachedException(String message) {
    super(message);
  }

}
