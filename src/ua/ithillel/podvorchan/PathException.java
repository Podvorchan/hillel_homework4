package ua.ithillel.podvorchan;

import java.util.NoSuchElementException;

public class PathException extends NoSuchElementException {

  public PathException(String message) {
    super(message);
  }

}
