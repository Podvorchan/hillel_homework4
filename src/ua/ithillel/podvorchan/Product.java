package ua.ithillel.podvorchan;

import java.time.LocalDate;
import java.util.UUID;

public class Product {

  private static final int DISCOUNT = 10;
  private final ProductCategory category;
  private float price;
  private final boolean discount;
  private final LocalDate date;
  private final UUID id;

  public ProductCategory getCategory() {
    return category;
  }

  public float getPrice() {
    return price;
  }

  public boolean isDiscounted() {
    return discount;
  }

  public LocalDate getDate() {
    return date;
  }

  public Product(ProductCategory category, float price, boolean discount, LocalDate date) {
    this.category = category;
    this.price = price;
    this.discount = discount;
    this.date = date;
    id = UUID.randomUUID();

  }

  public void applyDiscount() {
    price -= price * DISCOUNT / 100;
  }

  @Override
  public String toString() {
    return "Product{" +
        "category=" + category +
        ", price=" + price +
        ", discount =" + discount +
        ", date=" + date +
        "}";
  }

}
