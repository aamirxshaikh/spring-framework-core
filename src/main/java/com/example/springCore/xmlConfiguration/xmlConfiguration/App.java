package com.example.springCore.xmlConfiguration.xmlConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
      Arrays.stream(context.getBeanDefinitionNames())
              .forEach(System.out::println);

      System.out.println(context.getBean("name"));
      System.out.println(context.getBean("age"));

      System.out.println(context.getBean("vehicle"));
      System.out.println(context.getBean("runner"));

      context.getBean(Runner.class).run();
    }
  }
}
