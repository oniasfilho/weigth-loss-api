package io.oniasfilho.weightlossapi.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private int idade;
    private double altura;
}
