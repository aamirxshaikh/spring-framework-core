package com.example.springCore.componentLifecycle.exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Create a class called FileHandler with methods for opening and closing a file.
 * Annotate the opening method with the @PostConstruct annotation to indicate that it should be executed after the bean's initialization.
 * Annotate the closing method with the @PreDestroy annotation to indicate that it should be executed before the bean's destruction.
 * Create a class called FileManager that has a dependency on the FileHandler class.
 * Configure the application context to create beans for both FileHandler and FileManager classes.
 * Test the pre-construct and pre-destroy annotations by observing that the opening method is automatically called after the bean's initialization and the closing method is called before the bean's destruction.
 */

@Configuration
@ComponentScan
public class App {
  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(App.class)) {
//      System.out.println(context.getBean(FileManager.class));
      System.out.println(context.getBean(FileHandler.class));
    }
  }
}
