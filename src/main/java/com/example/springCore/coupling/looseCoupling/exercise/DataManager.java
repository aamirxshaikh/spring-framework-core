package com.example.springCore.coupling.looseCoupling.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataManager {
  private final DataAccess dataAccess;

  @Autowired
  public DataManager(DataAccess dataAccess) {
    this.dataAccess = dataAccess;
  }

  public void processData() {
    for (int i = 1; i <= 10; i++) {
      dataAccess.saveData("Data " + i);
    }

    dataAccess.retrieveData();
  }
}
