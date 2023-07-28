package com.example.springCore.coupling.looseCoupling.springConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      System.out.println(context.getBean(Vehicle.class));

      context.getBean(Runner.class).run();
    }
  }
}
