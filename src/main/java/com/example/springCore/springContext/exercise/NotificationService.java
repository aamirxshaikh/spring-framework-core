package com.example.springCore.springContext.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
  private final EmailService emailService;

  @Autowired
  public NotificationService(EmailService emailService) {
    this.emailService = emailService;
  }

  public void sendNotification(String message) {
    emailService.sendEmail(message);
  }

  @Override
  public String toString() {
    return "NotificationService{" +
            "emailService=" + emailService +
            '}';
  }
}
