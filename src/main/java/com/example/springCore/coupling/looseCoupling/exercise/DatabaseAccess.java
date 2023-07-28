package com.example.springCore.coupling.looseCoupling.exercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
public class DatabaseAccess implements DataAccess {
  private final List<String> database = new ArrayList<>();

  @Override
  public void retrieveData() {
    System.out.println("Retrieving the data from database");

    for (String data : database) {
      System.out.println(data);
    }
  }

  @Override
  public void saveData(String data) {
    System.out.println("Saving data to database");

    database.add(data);
  }
}
