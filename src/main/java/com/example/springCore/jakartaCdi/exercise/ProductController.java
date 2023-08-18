package com.example.springCore.jakartaCdi.exercise;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
public class ProductController {
  private final ProductManager productManager;

  @Inject
  public ProductController(ProductManager productManager) {
    this.productManager = productManager;
  }

  public void addProduct(String productName) {
    this.productManager.addProduct(productName);
  }

  public void retrieveProduct(String productId) {
    this.productManager.retrieveProduct(productId);
  }

  @Override
  public String toString() {
    return "ProductController{" +
            "productManager=" + productManager +
            '}';
  }
}
