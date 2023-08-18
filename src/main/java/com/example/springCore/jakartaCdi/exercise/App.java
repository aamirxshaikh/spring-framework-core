package com.example.springCore.jakartaCdi.exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Create a bean class, ProductManager, with methods for adding and retrieving products.
 * Annotate the ProductManager class with Jakarta CDI annotations, such as @Named and @Inject.
 * Create a class, ProductController, which has a dependency on the ProductManager.
 * Annotate the ProductController class with Jakarta CDI annotations and inject the ProductManager using the @Inject annotation.
 * Test the Jakarta CDI integration by invoking methods on the ProductController and observing the behavior of the injected ProductManager.
 */

@Configuration
@ComponentScan
public class App {
  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(App.class)) {
      var productController = context.getBean(ProductController.class);

      productController.addProduct("Soap");
      productController.retrieveProduct("1");
    }
  }
}
