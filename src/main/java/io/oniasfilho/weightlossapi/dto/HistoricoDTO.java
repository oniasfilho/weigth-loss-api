package io.oniasfilho.weightlossapi.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HistoricoDTO implements Comparable<HistoricoDTO> {
    private double peso;
    @JsonFormat(pattern="dd/MM/yyyy")
    private LocalDate data;

    @Override
    public int compareTo(HistoricoDTO historicoDTO) {
        return data.compareTo(historicoDTO.getData());
    }
}
