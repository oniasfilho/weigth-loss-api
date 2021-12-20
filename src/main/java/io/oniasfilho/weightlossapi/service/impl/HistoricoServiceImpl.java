package io.oniasfilho.weightlossapi.service.impl;

import io.oniasfilho.weightlossapi.dto.HistoricoPessoaDTO;
import io.oniasfilho.weightlossapi.repository.PessoaRepository;
import io.oniasfilho.weightlossapi.service.HistoricoService;
import org.springframework.stereotype.Service;

import java.util.List;

import static io.oniasfilho.weightlossapi.util.DtoUtils.pesosToListOfHistoricoDTO;
import static io.oniasfilho.weightlossapi.util.DtoUtils.pessoasToListOfHistoricoPessoaDTO;

@Service
public class HistoricoServiceImpl implements HistoricoService {

    PessoaRepository repository;

    public HistoricoServiceImpl(PessoaRepository repository) {
        this.repository = repository;
    }

    public HistoricoPessoaDTO getHistoricoById(int pessoaId) {
        var pessoa = repository.findById(pessoaId).get();
        var historicoDto = pesosToListOfHistoricoDTO(pessoa.getPesos());
        var historicoPessoaDto = new HistoricoPessoaDTO();
        historicoPessoaDto.setId(pessoa.getId());
        historicoPessoaDto.setNome(pessoa.getNome());
        historicoPessoaDto.setHistorico(historicoDto);

        return historicoPessoaDto;
    }

    public List<HistoricoPessoaDTO> getAllHistoricos() {
        var pessoas = repository.findAll();
        var historicoGeral = pessoasToListOfHistoricoPessoaDTO(pessoas);
        return historicoGeral;
    }
}
