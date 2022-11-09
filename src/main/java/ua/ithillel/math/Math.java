package ua.ithillel.math;

import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * @author Podvorchan Ruslan 09.11.2022
 */
public class Math {

  /**
   * @param n
   * @return sum of digits
   */
  public static int sumDigitsOfNumbers(int n) {
    int sum = 0;
    while (n != 0) {
      sum += (n % 10);
      n /= 10;
    }
    return sum;
  }

  /**
   * @param f
   * @return factorial
   */

  public static BigInteger factorial(int f) {
    if (f < 2) {
      return BigInteger.valueOf(1);
    } else {
      return IntStream.rangeClosed(2, f).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply)
          .get();
    }


  }

}
