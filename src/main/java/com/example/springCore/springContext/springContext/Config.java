package com.example.springCore.springContext.springContext;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {}
record Address (String firstLine, String city) {}

@Configuration
public class Config {
  @Bean
  public String name() {
    return "Aamir";
  }

  @Bean
  public int age() {
    return 23;
  }

  @Bean
  public Person person() {
    return new Person("John", 24, new Address("123 Rd", "New Mumbai"));
  }

  @Bean
  public Person person2MethodCall() {
    return new Person(name(), age(), address());
  }

  @Bean
  @Primary
  public Person person3Parameters(String name, int age, @Qualifier("address3Qualifier") Address address2) {
    return new Person(name, age, address2);
  }

  @Bean(name = "myAddress")
  @Primary
  public Address address() {
    return new Address("XYZ Road", "Mumbai");
  }

  @Bean
  @Qualifier("address3Qualifier")
  public Address address2() {
    return new Address("ABC Road", "Pune");
  }
}
