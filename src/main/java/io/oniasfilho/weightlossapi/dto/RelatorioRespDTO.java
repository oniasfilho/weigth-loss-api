package io.oniasfilho.weightlossapi.dto;

import lombok.Data;

@Data
public class RelatorioRespDTO {
    private int pessoa_id;
    private String nome;
    private double peso_atual;
    private double peso_anterior;
    private double peso_inicial;
    private double peso_meta;
}
