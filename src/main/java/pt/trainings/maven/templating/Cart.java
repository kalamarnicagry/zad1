package pt.trainings.maven.templating;

import java.util.ArrayList;
import java.util.List;

public class Cart {
  private final List<Product> products = new ArrayList<>();

  public void addProduct(Product product) {
    if (product != null) {
      products.add(product);
    }
  }

  public double calculateTotal() {
    double total = 0.0;
    for (Product product : products) {
      total += product.getPrice();
    }
    return total;
  }

  public int getItemCount() {
    return products.size();
  }
}