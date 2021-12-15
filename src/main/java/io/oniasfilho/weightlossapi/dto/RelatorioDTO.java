package io.oniasfilho.weightlossapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RelatorioDTO {
    private int pessoa_id;
    private String nome;
    private double peso_atual;
    private double peso_anterior;
    private double peso_inicial;
    private double peso_meta;
}
