package io.oniasfilho.weightlossapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HistoricoPessoaDTO {
    private String nome;
    private List<HistoricoDTO> historico;
}
