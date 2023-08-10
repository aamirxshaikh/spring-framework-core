package com.example.springCore.beanScopes.exercise;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShoppingCart {
  List<Product> productList;

  public ShoppingCart() {
    this.productList = new ArrayList<>();
  }

  public void addProduct(Product product) {
    productList.add(product);
  }

  public List<Product> getProducts() {
    return productList;
  }
}
