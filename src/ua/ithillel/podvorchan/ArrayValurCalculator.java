package ua.ithillel.podvorchan;

public class ArrayValurCalculator {

  public static void main(String[] args) {
    String[][] array = new String[][]
        {{"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}};

    String[][] array2 = new String[][]
        {{"1", "2", "3", "4"},
            {"5", "3", "6", "1"},
            {"9", "10", "x", "12"},
            {"13", "14", "15", "16"}};
    String[][] array3 = new String[][]
        {{"1", "2", "3", "4",},
            {"5", "6", "9", "7"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "4", "16"}};

    try {
      System.out.println(doCalс(array));
      System.out.println(doCalс(array2));
      System.out.println(doCalс(array3));
    } catch (ArraySizeException | ArrayDataException | NumberFormatException e) {
      System.out.println(e.getMessage());
    }

  }

  public static int doCalс(String[][] array)
      throws ArraySizeException, ArrayDataException, NumberFormatException {
    arraySize(array);
    int result = 0;

    for (int i = 0; i < array.length; i++) {

      for (int j = 0; j < array[i].length; j++) {
        try {
          result += Integer.parseInt(array[i][j]);
        } catch (NumberFormatException e) {

          throw new ArrayDataException(
              "Wrong data! : in a cell [" + i + "][" + j + "]");

        }

      }
    }
    return result;

  }

  private static void arraySize(String[][] array) {
    arraySize(array.length);

    for (String[] arra : array) {
      arraySize(arra.length);
    }
  }

  private static void arraySize(int length) {
    if (length != 4) {
      throw new ArraySizeException("Wrong size arrays!");
    }
  }
}



