package com.example.demo.controller;

import com.example.demo.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ClientController {

  private final ClientService clientService;

  @PutMapping("/test")
  public String test() {
    return clientService.test();
  }

}
