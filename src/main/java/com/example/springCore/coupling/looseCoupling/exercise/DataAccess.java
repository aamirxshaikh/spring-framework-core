package com.example.springCore.coupling.looseCoupling.exercise;

public interface DataAccess {
  void retrieveData();

  void saveData(String data);
}
