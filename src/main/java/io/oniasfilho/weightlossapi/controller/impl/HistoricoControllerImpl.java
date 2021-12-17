package io.oniasfilho.weightlossapi.controller.impl;

import io.oniasfilho.weightlossapi.controller.HistoricoController;
import io.oniasfilho.weightlossapi.dto.HistoricoDTO;
import io.oniasfilho.weightlossapi.repository.PessoaRepository;
import io.oniasfilho.weightlossapi.service.HistoricoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HistoricoControllerImpl implements HistoricoController {

    HistoricoService service;

    public HistoricoControllerImpl(HistoricoService service) {
        this.service = service;
    }

    @GetMapping("/historico/{pessoaId}")
    public List<HistoricoDTO> getHistorico(@PathVariable int pessoaId) {
        return service.getHistorico(pessoaId);
    }
}
