package com.example.springCore.coupling.tightCoupling;

public class App {
  public static void main(String[] args) {
//    var bike = new Bike();
//    var boat = new Boat();
    var car = new Car();

    var runner = new Runner(car);
    runner.run();
  }
}
