package io.oniasfilho.weightlossapi.util;

import io.oniasfilho.weightlossapi.dto.HistoricoDTO;
import io.oniasfilho.weightlossapi.dto.HistoricoPessoaDTO;
import io.oniasfilho.weightlossapi.model.Peso;
import io.oniasfilho.weightlossapi.model.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DtoUtils {

    public static List<HistoricoDTO> pesosToListOfHistoricoDTO(List<Peso> pesos){
        var response = new ArrayList<HistoricoDTO>();
        pesos.forEach(peso -> {
            response.add(new HistoricoDTO().builder()
                    .peso(peso.getPeso())
                    .data(peso.getDataCriacao())
                    .build()
            );
        });

        Collections.sort(response);
        return response;
    }

    public static List<HistoricoPessoaDTO> pessoasToListOfHistoricoPessoaDTO(Iterable<Pessoa> pessoas){
        var historicoGeral = new ArrayList<HistoricoPessoaDTO>();
        pessoas.forEach(pessoa -> {
            var pesosDTO = pesosToListOfHistoricoDTO(pessoa.getPesos());
            historicoGeral.add(new HistoricoPessoaDTO().builder()
                            .id(pessoa.getId())
                            .nome(pessoa.getNome())
                            .historico(pesosDTO)
                            .build()
            );
        });

        return historicoGeral;
    }
}
