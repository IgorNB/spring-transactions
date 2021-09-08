package com.example.demo.service;

import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepositiry;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StrangeService {

  private final ClientRepositiry clientRepositiry;

  @Transactional(readOnly = true)
  Client readOnlyTrueMethod() {
    return clientRepositiry.getById(0L);
  }

  @Transactional(readOnly = false)
  void readOnlyFalseMethod(Client client) {
    client.setName(UUID.randomUUID().toString());
    clientRepositiry.save(client);
  }

}
