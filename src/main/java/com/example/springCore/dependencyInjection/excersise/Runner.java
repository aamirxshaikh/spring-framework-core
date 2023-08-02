package com.example.springCore.dependencyInjection.excersise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Runner {
  private final Database database;

  @Autowired
  public Runner(Database database) {
    this.database = database;
  }

  public int findMax() {
    return Arrays.stream(database.retrieveData()).max().orElse(0);
  }
}
