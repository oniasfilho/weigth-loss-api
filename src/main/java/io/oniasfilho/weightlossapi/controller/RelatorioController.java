package io.oniasfilho.weightlossapi.controller;

import io.oniasfilho.weightlossapi.dto.RelatorioReqDTO;
import io.oniasfilho.weightlossapi.dto.RelatorioRespDTO;

public interface RelatorioController {
    public RelatorioRespDTO getRelatorio (int userId);

    public void createNewRelatorio (RelatorioReqDTO relatorio);
}
