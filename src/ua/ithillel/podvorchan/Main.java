package ua.ithillel.podvorchan;

import ua.ithillel.podvorchan.model.Follower;
import ua.ithillel.podvorchan.model.PublicFigure;

public class Main {

  public static void main(String args[]) {

    PublicFigure president = new PublicFigure("Zelenskyy", "president");

    PublicFigure primeMinister = new PublicFigure("Shmyhal", "prime minister");

    Follower ruslan = new Follower("Ruslan");

    Follower vadik = new Follower("Vadim");

    Follower vika = new Follower("Viktoria");

    Follower micha = new Follower("Michail");

    Follower jenya = new Follower("Evgen");

    president.addSubscriber(ruslan);

    president.addSubscriber(vadik);

    president.addSubscriber(vika);

    president.addSubscriber(micha);

    president.addSubscriber(jenya);

    primeMinister.addSubscriber(ruslan);

    primeMinister.addSubscriber(vadik);

    primeMinister.addSubscriber(vika);

    primeMinister.addSubscriber(micha);

    primeMinister.addSubscriber(jenya);

    president.message("Slava Ukraine!!!");

    primeMinister.message("Geroyam Slava!!!");

    president.removeSubscriber(micha);

    president.message("We believe in victory!!!");

  }

}
