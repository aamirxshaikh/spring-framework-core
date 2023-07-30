package com.example.springCore.springContext.exercise;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
  public void sendEmail(String message) {
    System.out.println("Sending " + message);
  }
}
