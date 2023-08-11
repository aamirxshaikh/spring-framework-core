package com.example.springCore.beanScopes.beanScopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class Singleton {}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class Prototype {}

@Configuration
@ComponentScan
public class App {
  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(App.class)) {
      System.out.println("Initialization of context in completed");

      System.out.println(context.getBean(Singleton.class));
      System.out.println(context.getBean(Singleton.class));
      System.out.println(context.getBean(Singleton.class));

      System.out.println(context.getBean(Prototype.class));
      System.out.println(context.getBean(Prototype.class));
      System.out.println(context.getBean(Prototype.class));
    }
  }
}
