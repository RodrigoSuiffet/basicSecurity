package com.bankapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {


  @GetMapping("/account")
  public String getAccount(String input) {
    return "Sitio: Noticias";
  }
}
