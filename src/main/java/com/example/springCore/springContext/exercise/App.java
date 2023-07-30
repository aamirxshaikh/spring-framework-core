package com.example.springCore.springContext.exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Create a class, EmailService, with a method for sending emails.
 * Configure the application context to define the EmailService as a bean.
 * Create another class, NotificationService, which has a dependency on the EmailService.
 * Configure the application context to inject the EmailService into the NotificationService.
 * Test the inversion of control by invoking the email sending method on the NotificationService.
 */

@Configuration
@ComponentScan
public class App {
  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(App.class)) {
      var notificationService = context.getBean(NotificationService.class);

      notificationService.sendNotification("Hi there!");
    }
  }
}
