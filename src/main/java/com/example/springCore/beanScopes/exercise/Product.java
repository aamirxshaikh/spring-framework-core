package com.example.springCore.beanScopes.exercise;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class Product {
  private final String name;
  private final double price;

  public Product() {
    this.name = "Example Product";
    this.price = 9.99;
  }

  @Override
  public String toString() {
    return "Product{" +
            "name='" + name + '\'' +
            ", price=" + price +
            '}';
  }
}
