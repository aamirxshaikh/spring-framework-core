package com.example.springCore.lazyAndEagerInitialization.exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Create a bean class, HeavyResource, that performs a time-consuming initialization process in its constructor.
 * Configure the application context to define the HeavyResource bean with lazy initialization.
 * Create another bean class, ResourceConsumer, which has a dependency on the HeavyResource.
 * Configure the application context to inject the HeavyResource into the ResourceConsumer.
 * Test the lazy initialization by observing that the HeavyResource is only initialized when accessed by the ResourceConsumer.
 */

@Configuration
@ComponentScan
public class App {
  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(App.class)) {
      System.out.println("Initialization of context in completed");

      var resourceConsumer = context.getBean(ResourceConsumer.class);

      resourceConsumer.useResource();
    }
  }
}
