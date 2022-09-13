package ua.ithillel.podvorchan;

public class ArrayValurCalculator {

    public static void main(String[] args) {
        String[][] arrays = new String[][]
            {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        String[][] arrays2 = new String[][]
            {{"1", "2", "3", "4"},
                {"5", "3", "6", "1"},
                {"9", "10", "x", "12"},
                {"13", "14", "15", "16"}};
        String[][] arrays3 = new String[][]
            {{"1", "2", "3", "4",},
                {"5", "6", "9", "7"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "4", "16"}};

        try {
            System.out.println(doCalс(arrays));
            System.out.println(doCalс(arrays2));
            System.out.println(doCalс(arrays3));
        } catch (ArraySizeException | ArrayDataException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int doCalс(String[][] array)
        throws ArraySizeException, ArrayDataException, NumberFormatException {

        int result = 0;
        if (array.length != 4) {
            throw new ArraySizeException("Wrong number of lines!");

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new ArraySizeException("Wrong size arrays!");
            }
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
}



