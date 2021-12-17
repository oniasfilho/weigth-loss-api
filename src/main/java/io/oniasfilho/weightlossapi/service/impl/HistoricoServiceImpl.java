package io.oniasfilho.weightlossapi.service.impl;

import io.oniasfilho.weightlossapi.dto.HistoricoDTO;
import io.oniasfilho.weightlossapi.repository.PessoaRepository;
import io.oniasfilho.weightlossapi.service.HistoricoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HistoricoServiceImpl implements HistoricoService {

    PessoaRepository repository;

    public HistoricoServiceImpl(PessoaRepository repository) {
        this.repository = repository;
    }

    public List<HistoricoDTO> getHistorico(int pessoaId) {
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
