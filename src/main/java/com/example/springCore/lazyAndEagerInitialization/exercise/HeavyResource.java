package com.example.springCore.lazyAndEagerInitialization.exercise;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class HeavyResource {
  public HeavyResource() {
    System.out.println("Initializing HeavyResource");
  }

  public void run() {
    System.out.println("HeavyResource is running");
  }
}
