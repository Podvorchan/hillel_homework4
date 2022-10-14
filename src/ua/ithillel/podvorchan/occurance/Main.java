package ua.ithillel.podvorchan.occurance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main extends FinderOccurrence {

  public Main(String name, int occurrence) {
    super(name, occurrence);
  }

  public static int countOccurrence(List<String> strings, String target) {
    int count = 0;
    for (String string : strings) {
      if (string.equals(target)) {
        count++;
      }
    }
    System.out.println("Count: " + count);
    return count;
  }

  public static List<Integer> toList(int[] array) {
    return Arrays.stream(array).boxed().collect(Collectors.toList());

  }

  public static List<Integer> findUnique(List<Integer> list) {
    List<Integer> listUnique = new ArrayList<>();
    for (Integer integer : list) {
      if (!listUnique.contains(integer)) {
        listUnique.add(integer);
      }
    }
    return listUnique;
  }

  public static void calcOccurrence(List<String> list) {
    List<String> copyOfList = new ArrayList<>(list);
    for (int i = 0; i < copyOfList.size(); i += 0) {
      int count = 0;
      System.out.print(copyOfList.get(i) + ": ");
      for (int j = copyOfList.size() - 1; j >= i; j--) {
        if (copyOfList.get(i).contains(copyOfList.get(j))) {
          copyOfList.remove(j);
          count++;
        }
      }
      System.out.println(count);
    }
    System.out.println();
  }

  public static List<FinderOccurrence> findOccurance(List<String> strList) {
    List<FinderOccurrence> result = new ArrayList<>();
    List<String> bufferList = new ArrayList<>();

    for (int i = 0; i < strList.size(); i++) {
      if (!bufferList.contains(strList.get(i))) {
        bufferList.add(strList.get(i));
        int count = 0;

        for (int j = 0; j < strList.size(); j++) {
          if (strList.get(i).equals(strList.get(j))) {
            count++;
          }
        }

        result.add(new FinderOccurrence(strList.get(i), count));
      }
    }

    return result;
  }

}