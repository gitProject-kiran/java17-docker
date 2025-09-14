package com.sk.dream.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

  @GetMapping("/home")
  public String home() {
    return "<h2>welcome to java17 docker environment with compose file</h2>";
  }
}