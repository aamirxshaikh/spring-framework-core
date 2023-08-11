package com.example.springCore.beanScopes.exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Create a bean class, Product, with a name and price attribute.
 * Configure the bean to have prototype scope.
 * Create a bean class, ShoppingCart, which has a list of Product beans as a dependency.
 * Configure the ShoppingCart bean to have singleton scope.
 * Test the bean scopes by adding products to the shopping cart and observing the behavior when retrieving the cart instance multiple times.
 */

@Configuration
@ComponentScan
public class App {
  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(App.class)) {
      ShoppingCart cart1 = context.getBean(ShoppingCart.class);
      ShoppingCart cart2 = context.getBean(ShoppingCart.class);

      Product product = context.getBean(Product.class);

      cart1.addProduct(product);

      System.out.println("Products in Cart 1: " + cart1.getProducts());
      System.out.println("Products in Cart 2: " + cart2.getProducts());
    }
  }
}
