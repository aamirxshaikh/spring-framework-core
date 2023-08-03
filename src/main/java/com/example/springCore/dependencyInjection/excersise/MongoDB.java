package com.example.springCore.dependencyInjection.excersise;

import org.springframework.stereotype.Component;

@Component
public class MongoDB implements Database {
  @Override
  public int[] retrieveData() {
    return new int[] { 11, 22, 33, 44, 55 };
  }
}
