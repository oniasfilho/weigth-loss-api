package io.oniasfilho.weightlossapi.controller;

import io.oniasfilho.weightlossapi.dto.PessoaDTO;
import io.oniasfilho.weightlossapi.dto.RelatorioRespDTO;

public interface PessoaController {

    public int createNewPessoa(PessoaDTO novaPessoa);
}
