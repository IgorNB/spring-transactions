package com.example.demo.service;

import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClientService {

  private final ClientRepository clientRepository;

  @Transactional
  public String test() {
    Client save = clientRepository.save(new Client());
    log.info("id = " + save.getId());
    log.info("id = " + save.getName());
    return save.getName();
  }
}
