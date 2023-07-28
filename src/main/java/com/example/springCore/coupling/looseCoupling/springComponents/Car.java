package com.example.springCore.coupling.looseCoupling.springComponents;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
  @Override
  public void accelerate() {
    System.out.println("Speed up the car");
  }

  @Override
  public void brake() {
    System.out.println("Slow down the car");
  }

  @Override
  public void turnLeft() {
    System.out.println("Turn the car left");
  }

  @Override
  public void turnRight() {
    System.out.println("Turn the car right");
  }
}
