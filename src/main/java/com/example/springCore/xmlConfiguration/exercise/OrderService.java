package com.example.springCore.xmlConfiguration.exercise;

public class OrderService {
  private final Order order;

  public OrderService(Order order) {
    this.order = order;
  }

  public void displayOrderDetails() {
    System.out.println("Order Details:");
    System.out.println("Order ID: " + order.getOrderId());
    System.out.println("Customer Name: " + order.getCustomer().getFirstName() + " " + order.getCustomer().getLastName());
    System.out.println("Customer Email: " + order.getCustomer().getEmail());
  }

  @Override
  public String toString() {
    return "OrderService{" +
            "order=" + order +
            '}';
  }
}
