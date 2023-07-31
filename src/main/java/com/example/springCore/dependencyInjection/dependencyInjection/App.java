package com.example.springCore.dependencyInjection.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class Person {
//  Field Injection
//  @Autowired
  private Address address;

//  Field Injection
//  @Autowired
  private Profile profile;

//  Constructor Injection
  @Autowired
  public Person(Address address, Profile profile) {
    System.out.println("Constructor based");
    this.address = address;
    this.profile = profile;
  }

  public Address getAddress() {
    return address;
  }

//  Setter Injection
//  @Autowired
  public void setAddress(Address address) {
    System.out.println("Setter based");
    this.address = address;
  }

  public Profile getProfile() {
    return profile;
  }

//  Setter Injection
//  @Autowired
  public void setProfile(Profile profile) {
    System.out.println("Setter based");
    this.profile = profile;
  }

  @Override
  public String toString() {
    return "Person{" +
            "address=" + address +
            ", profile=" + profile +
            '}';
  }
}

@Component
class Address {}

@Component
class Profile {}

@Configuration
@ComponentScan
public class App {
  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(App.class)) {
      Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

      System.out.println(context.getBean(Person.class));
    }
  }
}
