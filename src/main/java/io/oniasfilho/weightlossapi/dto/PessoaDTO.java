package io.oniasfilho.weightlossapi.dto;

import lombok.Data;

@Data
public class PessoaDTO {
    private int id;
    private String nome;
    private int idade;
    private double altura;
    private double meta;
}
