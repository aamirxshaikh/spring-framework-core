package com.example.springCore.dependencyInjection.excersise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MySQL implements Database {
  @Override
  public int[] retrieveData() {
    return new int[] { 1, 2, 3, 4, 5 };
  }
}
