package com.example.springCore.coupling.looseCoupling.exercise;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FileAccess implements DataAccess {
  private final List<String> file = new ArrayList<>();

  @Override
  public void retrieveData() {
    System.out.println("Retrieving data from file");

    for (String data : file) {
      System.out.println(data);
    }
  }

  @Override
  public void saveData(String data) {
    System.out.println("Saving data to file");

    file.add(data);
  }
}
