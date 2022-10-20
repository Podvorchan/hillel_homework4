package ua.ithillel.podvorchan.model;

import java.util.ArrayList;
import java.util.List;
import ua.ithillel.podvorchan.api.Observer;
import ua.ithillel.podvorchan.api.Subject;

public class PublicFigure implements Subject {

  protected List<Observer> observers = new ArrayList<Observer>();
  protected String name;
  protected String nickname;

  public PublicFigure(String name, String nickname) {
    super();
    this.name = name;
    this.nickname = "#" + nickname;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNickname() {
    return nickname;
  }

  public void message(String message) {
    System.out.printf("\nName: %s, Message: %s\n", name, message);
    notifySubscribers(message);
  }

  @Override
  public synchronized void addSubscriber(Observer observer) {
    observers.add(observer);
  }

  @Override
  public synchronized void removeSubscriber(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifySubscribers(String message) {
    observers.forEach(observer -> observer.notification(nickname, message));
  }
}
