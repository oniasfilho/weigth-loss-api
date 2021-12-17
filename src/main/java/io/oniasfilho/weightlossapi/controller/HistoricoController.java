package io.oniasfilho.weightlossapi.controller;

import io.oniasfilho.weightlossapi.dto.HistoricoDTO;

import java.util.List;

public interface HistoricoController {
    public List<HistoricoDTO> getHistorico(int pessoaId);
}
