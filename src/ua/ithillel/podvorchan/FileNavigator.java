package ua.ithillel.podvorchan;

import static java.lang.String.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileNavigator {

  public Map<String, ArrayList<FileData>> fileStorage = new HashMap<>();

  public void add(String path, FileData file) {
    checkPath(path, file);

    if (fileStorage.containsKey(path)) {
      fileStorage.get(path).add(file);

    } else {
      ArrayList<FileData> newFile = new ArrayList<>();
      newFile.add(file);
      fileStorage.put(path, newFile);
    }
  }

  public ArrayList<FileData> find(String path) {
    return new ArrayList<>(fileStorage.get(path));
  }

  public ArrayList<FileData> filterBySize(int maxSize) {
    ArrayList<FileData> allowedSize = new ArrayList<>();
    for (ArrayList<FileData> value : fileStorage.values()) {
      for (FileData o : value) {
        if ((o.getSize() <= maxSize)) {
          allowedSize.add(o);

        }
      }
    }
    return allowedSize;
  }


  public void remove(String path) {
    fileStorage.remove(path, fileStorage.get(path));

  }

  public List<FileData> sortBySize() {
    List<FileData> fileWithAllowableSize = new ArrayList<>();
    for (ArrayList<FileData> value : fileStorage.values()) {
      fileWithAllowableSize.addAll(value);
    }
    for (int i = fileWithAllowableSize.size() - 1; i >= 1; i--) {
      for (int j = 0; j < i; j++) {
        if (fileWithAllowableSize.get(j).getSize() > fileWithAllowableSize.get(j + 1).getSize()) {
          FileData targetValue = fileWithAllowableSize.get(j);
          fileWithAllowableSize.set(j, fileWithAllowableSize.get(j + 1));
          fileWithAllowableSize.set(j + 1, targetValue);
        }
      }

    }
    return fileWithAllowableSize;
  }

  public void checkPath(String path, FileData file) throws PathException {
    if (!file.getPath().equals(path)) {
      throw new PathException(
          format("Path %s \n FileDate: {name: %s, size: %s, path:%s}", path, file.getName(),
              file.getSize(), file.getPath()));
    }
  }

}
