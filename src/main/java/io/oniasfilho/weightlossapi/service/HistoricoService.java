package io.oniasfilho.weightlossapi.service;

import io.oniasfilho.weightlossapi.dto.HistoricoPessoaDTO;

import java.util.List;


public interface HistoricoService {
    public HistoricoPessoaDTO getHistoricoById(int pessoaId);
    public List<HistoricoPessoaDTO> getAllHistoricos();
}
