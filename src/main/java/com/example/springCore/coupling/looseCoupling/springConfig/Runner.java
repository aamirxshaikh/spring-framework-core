package com.example.springCore.coupling.looseCoupling.springConfig;

public class Runner {
  private final Vehicle vehicle;

  public Runner(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public void run() {
    System.out.println("Vehicle is running..." + vehicle);
    vehicle.accelerate();
    vehicle.brake();
    vehicle.turnLeft();
    vehicle.turnRight();
  }
}
