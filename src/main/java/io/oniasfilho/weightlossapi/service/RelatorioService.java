package io.oniasfilho.weightlossapi.service;

import io.oniasfilho.weightlossapi.dto.RelatorioReqDTO;
import io.oniasfilho.weightlossapi.dto.RelatorioRespDTO;

public interface RelatorioService {
    public RelatorioRespDTO getRelatorio (int userId);

    public void createNewRelatorio (RelatorioReqDTO relatorio);
}
