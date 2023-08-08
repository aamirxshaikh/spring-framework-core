package com.example.springCore.lazyAndEagerInitialization.lazyAndEagerInitialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
class Person {
  Address address;

  @Autowired
  public Person(Address address) {
    System.out.println("Constructor");
    this.address = address;
  }

  @Override
  public String toString() {
    return "Person{" +
            "address=" + address +
            '}';
  }
}

@Component
class Address {}

@Configuration
@ComponentScan
public class App {
  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(App.class)) {
      System.out.println("Initialization of context in completed");

//      Fetching the Person bean explicitly
      System.out.println(context.getBean(Person.class));
    }
  }
}
