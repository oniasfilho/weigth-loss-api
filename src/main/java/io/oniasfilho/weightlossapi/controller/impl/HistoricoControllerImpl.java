package io.oniasfilho.weightlossapi.controller.impl;

import io.oniasfilho.weightlossapi.controller.HistoricoController;
import io.oniasfilho.weightlossapi.dto.HistoricoDTO;
import io.oniasfilho.weightlossapi.repository.PessoaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HistoricoControllerImpl implements HistoricoController {

    PessoaRepository repository;

    public HistoricoControllerImpl(PessoaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/historico/{pessoaId}")
    public List<HistoricoDTO> getHistorico(@PathVariable int pessoaId) {
        var pessoa = repository.findById(pessoaId).get();
        var historicoDto = new ArrayList<HistoricoDTO>();
        pessoa.getPesos().forEach(
                peso -> historicoDto.add(
                        new HistoricoDTO(peso.getPeso(), peso.getDataCriacao())
                )
        );
        return historicoDto;
    }
}
