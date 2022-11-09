package ua.ithillel.logger.exception;

/**
 * @author Podvorchan Ruslan 08.11.2022
 */
public class FileMaxSizeReachedException extends Throwable {

  public FileMaxSizeReachedException(String message) {
    super(message);
  }

}
