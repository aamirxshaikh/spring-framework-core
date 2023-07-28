package com.example.springCore.coupling.tightCoupling;

public class Runner {
  private final Car car;

  public Runner(Car car) {
    this.car = car;
  }

  public void run() {
    System.out.println("Car is running..." + car);
    car.accelerate();
    car.brake();
    car.turnLeft();
    car.turnRight();
  }
}
