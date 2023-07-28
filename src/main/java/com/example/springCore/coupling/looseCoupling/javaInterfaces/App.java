package com.example.springCore.coupling.looseCoupling.javaInterfaces;

public class App {
  public static void main(String[] args) {
    var car = new Car();
    var bike = new Bike();
    var boat = new Boat();

    var runner = new Runner(boat);
    runner.run();
  }
}
