package ua.ithillel.podvorchan.coffee.order;

import java.util.LinkedList;

public class CoffeeOrderBoard {


  LinkedList<Order> orders = new LinkedList<>();


  public void add(String name) {

    orders.add(new Order(orders.size() + 1, name));
  }


  public Order deliver() {
    return orders.pollFirst();
  }


  public Order deliver(int number) {
    Order order = find(number);
    orders.remove(order);
    return order;
  }

  private Order find(int number) {
    for (Order order : orders) {
      if (order.getNumber() == number) {
        return order;
      }
    }
    return null;
  }


  public void draw() {
    System.out.println("=============");
    System.out.println("Num   |  Name");
    for (Order order : orders) {
      if (order.getNumber() < 10) {
        System.out.println(order.getNumber() + "     |  " + order.getName());
      } else {
        System.out.println(order.getNumber() + "    |  " + order.getName());
      }
    }
  }


}
