package ua.ithillel.podvorchan.occurance;


public class FinderOccurrence {

  private String name;
  private int occurrence;

  public FinderOccurrence(String name, int occurrence) {
    this.name = name;
    this.occurrence = occurrence;
  }

  public String getName() {
    return name;
  }

  public int getOccurrence() {
    return occurrence;
  }

  @Override
  public String toString() {
    return "\n{" +
        "name: \"" + name + '\"' +
        ", occurrence: " + occurrence +
        "}";
  }

}
