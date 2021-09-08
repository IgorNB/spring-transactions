package com.example.demo.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "CLIENT")
@Entity()
public class Client {

  @Id
  @GeneratedValue
  @Column(name = "ID")
  public Long Id;

  @Column(name = "NAME")
  public String name;

}