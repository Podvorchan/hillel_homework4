package ua.ithillel.podvorchan;

import java.util.Arrays;

public class ValueCalculator {

  private static final int SIZE = 1000000;
  private static final int HALF = SIZE / 2;

  private final float[] arr = new float[SIZE];

  public void doCalc() {
    long start = System.currentTimeMillis();
    Arrays.fill(arr, 2);

    float[] source1 = new float[HALF];
    float[] source2 = new float[HALF];

    System.arraycopy(arr, 0, source1, 0, HALF);
    System.arraycopy(arr, HALF, source2, 0, HALF);

    Thread thread1 = new Thread(getCalcOperation(source1));
    Thread thread2 = new Thread(getCalcOperation(source2));

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.arraycopy(source1, 0, arr, 0, HALF);
    System.arraycopy(source2, 0, arr, HALF, HALF);

    long end = System.currentTimeMillis() - start;

    System.out.println("Operation took: " + end);
  }

  private Runnable getCalcOperation(float[] arr) {
    return new Runnable() {
      @Override
      public void run() {
        doCalc(arr);
      }
    };
  }

  private void doCalc(float[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(
          0.4f + i / 2));
    }
  }

}
