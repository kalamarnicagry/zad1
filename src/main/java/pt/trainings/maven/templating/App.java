package pt.trainings.maven.templating;

public class App {
  public static void main(String[] args) {
    Cart cart = new Cart();

    cart.addProduct(new Product("book", 40.0));
    cart.addProduct(new Product("pen", 12.0));

    System.out.println("number of products: " + cart.getItemCount());
    System.out.println("cost: " + cart.calculateTotal() + " PLN");
  }
}