package io.oniasfilho.weightlossapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class HistoricoDTO {
    private double peso;
    private LocalDate data;
}
