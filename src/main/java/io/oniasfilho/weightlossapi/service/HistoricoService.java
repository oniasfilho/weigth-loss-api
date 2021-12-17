package io.oniasfilho.weightlossapi.service;

import io.oniasfilho.weightlossapi.dto.HistoricoDTO;

import java.util.List;

public interface HistoricoService {
    public List<HistoricoDTO> getHistorico(int pessoaId);
}
