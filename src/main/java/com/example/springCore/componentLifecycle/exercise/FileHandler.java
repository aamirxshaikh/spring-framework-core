package com.example.springCore.componentLifecycle.exercise;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class FileHandler {
  String filePath;

  public FileHandler() {
    System.out.println("FileHandler constructor");
    this.filePath = "foo.txt";
  }

  @PostConstruct
  public void openFile() {
    System.out.println("Opening file : " + filePath);
  }

  @PreDestroy
  public void closeFile() {
    System.out.println("Closing file : " + filePath);
  }
}
