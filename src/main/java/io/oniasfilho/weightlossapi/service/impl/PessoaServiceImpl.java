package io.oniasfilho.weightlossapi.service.impl;

import io.oniasfilho.weightlossapi.dto.PessoaDTO;
import io.oniasfilho.weightlossapi.model.Pessoa;
import io.oniasfilho.weightlossapi.repository.PessoaRepository;
import io.oniasfilho.weightlossapi.service.PessoaService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PessoaServiceImpl implements PessoaService {

    PessoaRepository repository;

    public PessoaServiceImpl(PessoaRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/pessoa")
    public int createNewPessoa(@RequestBody PessoaDTO novaPessoa) {
        var pessoa = repository.save(
                Pessoa.builder()
                .nome(novaPessoa.getNome())
                .idade(novaPessoa.getIdade())
                .altura(novaPessoa.getAltura())
                .meta(novaPessoa.getMeta())
                .build());
        return pessoa.getId();
    }
}
