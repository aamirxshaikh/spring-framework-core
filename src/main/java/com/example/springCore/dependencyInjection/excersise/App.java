package com.example.springCore.dependencyInjection.excersise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Create an interface, Database, with a method for retrieving data.
 * Implement two classes, MongoDB and MySQL, that implement the Database interface.
 * Create a bean class, Runner, which has a dependency on the Database interface.
 * Configure the application context to inject either MongoDB or MySQL into the Runner.
 * Test the inversion of control by invoking the findMax() method on the Runner to get the maximum value from the retrieved data.
 */

@Configuration
@ComponentScan
public class App {
  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(App.class)) {
      Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

      System.out.println(context.getBean(Database.class));

      System.out.println(context.getBean(Runner.class).findMax());
    }
  }
}
