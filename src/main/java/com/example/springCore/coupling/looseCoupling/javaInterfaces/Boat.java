package com.example.springCore.coupling.looseCoupling.javaInterfaces;

public class Boat implements Vehicle {
  @Override
  public void accelerate() {
    System.out.println("Speed up the boat");
  }

  @Override
  public void brake() {
    System.out.println("Slow down the boat");
  }

  @Override
  public void turnLeft() {
    System.out.println("Turn the boat left");
  }

  @Override
  public void turnRight() {
    System.out.println("Turn the boat right");
  }
}
