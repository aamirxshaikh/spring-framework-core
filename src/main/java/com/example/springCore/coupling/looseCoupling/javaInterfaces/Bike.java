package com.example.springCore.coupling.looseCoupling.javaInterfaces;

public class Bike implements Vehicle {
  @Override
  public void accelerate() {
    System.out.println("Speed up the bike");
  }

  @Override
  public void brake() {
    System.out.println("Slow down the bike");
  }

  @Override
  public void turnLeft() {
    System.out.println("Turn the bike left");
  }

  @Override
  public void turnRight() {
    System.out.println("Turn the bike right");
  }
}
