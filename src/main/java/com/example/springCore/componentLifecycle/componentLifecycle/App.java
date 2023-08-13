package com.example.springCore.componentLifecycle.componentLifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Person {
  private final Profile profile;

  @Autowired
  public Person(Profile profile) {
    System.out.println("Constructor");
    this.profile = profile;
  }

  @PostConstruct
  public void init() {
    profile.init();
  }

  @PreDestroy
  public void cleanUp() {
    System.out.println("Closing connections");
  }

  @Override
  public String toString() {
    return "Person{" +
            "profile=" + profile +
            '}';
  }
}

@Component
class Profile {
  public void init() {
    System.out.println("Initializing..");
  }
}

@Configuration
@ComponentScan
public class App {
  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(App.class)) {
      System.out.println("Initialization of context in completed");

      System.out.println(context.getBean(Person.class));
    }
  }
}
