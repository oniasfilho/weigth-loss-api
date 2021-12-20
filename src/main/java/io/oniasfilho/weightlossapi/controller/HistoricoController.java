package io.oniasfilho.weightlossapi.controller;

import io.oniasfilho.weightlossapi.dto.HistoricoPessoaDTO;

import java.util.List;

public interface HistoricoController {
    public HistoricoPessoaDTO getHistoricoById(int pessoaId);
    public List<HistoricoPessoaDTO> getAllHistoricos();
}
