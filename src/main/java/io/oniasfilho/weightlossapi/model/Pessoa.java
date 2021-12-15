package io.oniasfilho.weightlossapi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private int idade;
    private double altura;
    private double meta;
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "pessoa_id")
    private List<Peso> pesos;
}
