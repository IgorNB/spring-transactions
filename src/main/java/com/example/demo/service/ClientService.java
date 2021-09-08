package com.example.demo.service;

import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepositiry;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ClientService {

  private final StrangeService strangeService;

  private final ClientRepositiry clientRepositiry;

  @Transactional(readOnly = false)
  public void makeSomeStrangeThings() {
    Client client = strangeService.readOnlyTrueMethod();
    strangeService.readOnlyFalseMethod(client);
  }

  @Transactional(readOnly = false)
  public void makeSomeNormalThings(Client client) {
    strangeService.readOnlyFalseMethod(client);
  }

  @Transactional(readOnly = false)
  public String getClientName() {
    return clientRepositiry.getById(0L).getName();
  }
}
