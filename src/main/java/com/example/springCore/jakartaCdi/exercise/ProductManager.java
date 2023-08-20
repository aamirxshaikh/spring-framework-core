package com.example.springCore.jakartaCdi.exercise;

import jakarta.inject.Named;

@Named
public class ProductManager {
  public void addProduct(String productName) {
    System.out.println("Product added: " + productName);
  }

  public void retrieveProduct(String productId) {
    System.out.println("Product retrieved: " + productId);
  }
}
