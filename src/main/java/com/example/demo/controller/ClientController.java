package com.example.demo.controller;

import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepositiry;
import com.example.demo.service.ClientService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ClientController {

  private final ClientService clientService;

  private final ClientRepositiry clientRepositiry;

  @PutMapping("/makeSomeStrangeThings")
  public void makeSomeStrangeThings() {
    clientService.makeSomeStrangeThings();
  }

  @Transactional(readOnly = false)
  @PutMapping("/makeSomeNormalThings")
  public void makeSomeNormalThings() {
    Client byId = clientRepositiry.getById(0L);
    clientService.makeSomeNormalThings(byId);
  }

  @GetMapping("/getClientName")
  public String getClientName() {
    return clientService.getClientName();
  }
}
