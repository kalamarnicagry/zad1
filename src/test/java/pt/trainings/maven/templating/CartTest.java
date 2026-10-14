package pt.trainings.maven.templating;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CartTest {

  @Test
  public void shouldCalculateTotalForMultipleProducts() {
    Cart cart = new Cart();
    cart.addProduct(new Product("pizza", 10));
    cart.addProduct(new Product("yoghurt", 4.5));

    assertEquals(14.5, cart.calculateTotal(), 0.001);
  }

  @Test
  public void shouldReturnZeroForEmptyCart() {
    Cart cart = new Cart();
    assertEquals(0.0, cart.calculateTotal(), 0.001);
  }
}
