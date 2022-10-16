package ua.ithillel.podvorchan;

import java.util.Arrays;
import java.util.List;

public class ToList {

  public static <T> List<T> toList(T[] array) {
    return Arrays.asList(array);

  }
}
