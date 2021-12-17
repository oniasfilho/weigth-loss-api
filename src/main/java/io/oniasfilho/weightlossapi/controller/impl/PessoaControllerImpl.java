package io.oniasfilho.weightlossapi.controller.impl;

import io.oniasfilho.weightlossapi.controller.PessoaController;
import io.oniasfilho.weightlossapi.dto.PessoaDTO;
import io.oniasfilho.weightlossapi.service.PessoaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaControllerImpl implements PessoaController {

    PessoaService service;

    public PessoaControllerImpl(PessoaService service) {
        this.service = service;
    }

    @PostMapping("/pessoa")
    public int createNewPessoa(@RequestBody PessoaDTO novaPessoa) {
        return service.createNewPessoa(novaPessoa);
    }
}
