package com.example.springCore.lazyAndEagerInitialization.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResourceConsumer {
  private final HeavyResource heavyResource;

  @Autowired
  public ResourceConsumer(HeavyResource heavyResource) {
    this.heavyResource = heavyResource;
  }

  public void useResource() {
    System.out.println("ResourceConsumer is using HeavyResource");
    heavyResource.run();
  }
}
