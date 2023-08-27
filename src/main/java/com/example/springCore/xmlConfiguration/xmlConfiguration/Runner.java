package com.example.springCore.xmlConfiguration.xmlConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Runner {
  private final Vehicle vehicle;

  @Autowired
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

  @Override
  public String toString() {
    return "Runner{" +
            "vehicle=" + vehicle +
            '}';
  }
}
