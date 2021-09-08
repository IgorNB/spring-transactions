package com.example.demo.entity;

import com.example.demo.entity.util.GuidGenerator;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GeneratorType;

@Getter
@Setter
@Table(name = "CLIENT")
@Entity()
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "ID")
  public Long Id;

  @GeneratorType(type = GuidGenerator.class, when = GenerationTime.INSERT)
  @Column(name = "NAME", nullable = false, unique = true, updatable = false)
  public String name;

}