package com.kmylosis.springboot.app;

import com.kmylosis.springboot.SpringBootDemoBasePackage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {SpringBootDemoBasePackage.class})
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
    System.out.println("Hello world!");
  }
}