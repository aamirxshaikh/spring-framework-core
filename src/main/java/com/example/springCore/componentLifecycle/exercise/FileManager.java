package com.example.springCore.componentLifecycle.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileManager {
  private final FileHandler fileHandler;

  @Autowired
  public FileManager(FileHandler fileHandler) {
    this.fileHandler = fileHandler;
  }

  @Override
  public String toString() {
    return "FileManager{" +
            "fileHandler=" + fileHandler +
            '}';
  }
}
