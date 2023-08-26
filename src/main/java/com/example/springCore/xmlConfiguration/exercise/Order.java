package com.example.springCore.xmlConfiguration.exercise;

public class Order {
  private final int orderId;
  private final Customer customer;

  public Order(int orderId, Customer customer) {
    this.orderId = orderId;
    this.customer = customer;
  }

  public int getOrderId() {
    return orderId;
  }

  public Customer getCustomer() {
    return customer;
  }

  @Override
  public String toString() {
    return "Order{" +
            "orderId=" + orderId +
            ", customer=" + customer +
            '}';
  }
}
