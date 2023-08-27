package com.example.springCore.xmlConfiguration.exercise;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Create a bean class named Customer with the following properties:
 * firstName (String)
 * lastName (String)
 * email (String)
 * Configure the Customer bean using XML configuration.
 * Create a bean class named Order with the following properties:
 * orderId (String)
 * customer (Customer)
 * Configure the Order bean using XML configuration and inject the Customer bean as a dependency.
 * Create a bean class named OrderService with a dependency on the Order bean.
 * Configure the OrderService bean using XML configuration and inject the Order bean as a dependency.
 * Create a Spring XML configuration file named exercise.xml.
 * Define the Customer, Order, and OrderService beans in the XML configuration file.
 * Use constructor injection to inject the Customer bean into the Order bean and the Order bean into the OrderService bean.
 * Implement a method in the OrderService class to display the order details, including the customer information.
 * In the App class, load the XML configuration file exercise.xml to initialize the Spring application context.
 * Retrieve the OrderService bean from the application context.
 * Invoke the method on the OrderService bean to display the order details.
 * Test the application and verify that the order details, including the customer information, are correctly displayed.
 */

public class App {
  public static void main(String[] args) {
    try (var context = new ClassPathXmlApplicationContext("exercise.xml")) {
      Arrays.stream(context.getBeanDefinitionNames())
              .forEach(System.out::println);

      System.out.println("Order Service - " + context.getBean("orderService"));
      context.getBean("orderService", OrderService.class).displayOrderDetails();
    }
  }
}
