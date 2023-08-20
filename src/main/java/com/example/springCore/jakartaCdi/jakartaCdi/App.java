package com.example.springCore.jakartaCdi.jakartaCdi;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Named
class Person {
  private final Profile profile;

  @Inject
  public Person(Profile profile) {
    System.out.println("Constructor");
    this.profile = profile;
  }

  public Profile getProfile() {
    return profile;
  }

  @Override
  public String toString() {
    return "Person{" +
            "profile=" + profile +
            '}';
  }
}

@Named
class Profile {
}

@Configuration
@ComponentScan
public class App {
  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(App.class)) {
      System.out.println(context.getBean(Person.class).getProfile());
    }
  }
}
