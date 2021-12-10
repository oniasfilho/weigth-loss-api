package io.oniasfilho.weightlossapi.controller.impl;

import io.oniasfilho.weightlossapi.controller.PessoaController;
import io.oniasfilho.weightlossapi.dto.RelatorioRespDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaControllerImpl implements PessoaController {

    @GetMapping("/pessoa/{id}/relatorio/")
    public RelatorioRespDTO getRelatorio(int userId) {
        return null;
    }
}
