package com.example.springCore.springContext.springContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  public static void main(String[] args) {
//    Launch Spring context

    try (var context = new AnnotationConfigApplicationContext(Config.class)) {

//    Get beans

      System.out.println("name : " + context.getBean("name"));
      System.out.println("age : " + context.getBean("age"));
      System.out.println("person : " + context.getBean("person"));
      System.out.println("person2MethodCall : " + context.getBean("person2MethodCall"));
      System.out.println("person3Parameters : " + context.getBean("person3Parameters"));
      System.out.println("myAddress : " + context.getBean("myAddress"));
      System.out.println("Person.class : " + context.getBean(Person.class));
      System.out.println("Address.class : " + context.getBean(Address.class));


//      System.out.println("getBeanDefinitionCount : " + context.getBeanDefinitionCount());
//      System.out.println("getBeanDefinition : " + context.getBeanDefinition("name"));
//      Arrays.stream(context.getBeanDefinitionNames())
//              .forEach(System.out::println);
    }
  }
}
