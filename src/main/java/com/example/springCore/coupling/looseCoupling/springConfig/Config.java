package com.example.springCore.coupling.looseCoupling.springConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
  @Bean
  public Vehicle vehicle() {
    return new Car();
  }

  @Bean
  public Runner runner(Vehicle vehicle) {
    return new Runner(vehicle);
  }
}
