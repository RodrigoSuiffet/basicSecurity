package com.bankapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

  @GetMapping("/cards")
  public String get(String input) {
    return "Sitio: Tarjetas";
  }
}
