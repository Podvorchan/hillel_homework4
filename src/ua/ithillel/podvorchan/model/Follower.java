package ua.ithillel.podvorchan.model;

import ua.ithillel.podvorchan.api.Observer;

public class Follower implements Observer {

  protected String name;

  public Follower(String name) {
    super();
    this.name = name;
  }

  @Override
  public void notification(String nickname, String message) {
    System.out.printf("'%s' received notification from nickname: '%s', Message: '%s'\n", name,
        nickname,
        message);

  }

}
