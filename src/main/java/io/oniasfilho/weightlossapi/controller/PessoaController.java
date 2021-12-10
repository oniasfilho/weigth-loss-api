package io.oniasfilho.weightlossapi.controller;

import io.oniasfilho.weightlossapi.dto.RelatorioRespDTO;

public interface PessoaController {

    public RelatorioRespDTO getRelatorio(int userId);
}
