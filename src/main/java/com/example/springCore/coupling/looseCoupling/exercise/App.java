package com.example.springCore.coupling.looseCoupling.exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Create an interface, DataAccess, with methods for retrieving and saving data.
 * Implement two classes, DatabaseAccess and FileAccess, that implement the DataAccess interface.
 * Create a bean class, DataManager, which has a dependency on the DataAccess interface.
 * Configure the application context to inject either the DatabaseAccess or FileAccess into the DataManager.
 * Test the loose coupling by invoking the data retrieval and saving methods on the DataManager.
 * */

@Configuration
@ComponentScan
public class App {
  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(App.class)) {
      System.out.println(context.getBean(DataAccess.class));

      context.getBean(DataManager.class).processData();
    }
  }
}
