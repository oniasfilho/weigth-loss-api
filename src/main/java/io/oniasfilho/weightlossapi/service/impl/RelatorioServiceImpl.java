package io.oniasfilho.weightlossapi.service.impl;

import io.oniasfilho.weightlossapi.dto.RelatorioDTO;
import io.oniasfilho.weightlossapi.dto.RelatorioReqDTO;
import io.oniasfilho.weightlossapi.dto.RelatorioRespDTO;
import io.oniasfilho.weightlossapi.model.Peso;
import io.oniasfilho.weightlossapi.repository.PesoRepository;
import io.oniasfilho.weightlossapi.repository.PessoaRepository;
import io.oniasfilho.weightlossapi.service.RelatorioService;
import org.springframework.stereotype.Service;

@Service
public class RelatorioServiceImpl implements RelatorioService {

    private PessoaRepository pessoaRepository;
    private PesoRepository pesoRepository;

    public RelatorioServiceImpl(PessoaRepository pessoaRepository, PesoRepository pesoRepository) {
        this.pessoaRepository = pessoaRepository;
        this.pesoRepository = pesoRepository;
    }

    public RelatorioRespDTO getRelatorio(int userId) {
        var pessoa = pessoaRepository.findById(userId).get();
        var pesos = pessoa.getPesos();

        var peso_atual = pesos.get(pesos.size() - 1).getPeso();
        var peso_anterior = pesos.get(pesos.size() - 2).getPeso();
        var peso_inicial = pesos.get(0).getPeso();
        var peso_meta = pessoa.getMeta();
        return RelatorioRespDTO.builder()
                .pessoa_id(pessoa.getId())
                .nome(pessoa.getNome())
                .peso_atual(peso_atual)
                .peso_anterior(peso_anterior)
                .peso_inicial(peso_inicial)
                .peso_meta(peso_meta)
                .build();
    }

    public void createNewRelatorio(RelatorioReqDTO relatorio) {
        var pessoa = pessoaRepository.findById(relatorio.getPessoa_id()).get();
        var pesos = pessoa.getPesos();
        var novoPeso = new Peso();
        novoPeso.setPeso(relatorio.getNovo_peso());
        pesos.add(novoPeso);
        pessoa.setPesos(pesos);
        pessoa = pessoaRepository.save(pessoa);

        var relatorioNovo = RelatorioDTO.builder()
                .pessoa_id(relatorio.getPessoa_id())
                .nome(pessoa.getNome())
                .peso_atual(pesos.get(pessoa.getPesos().size() - 1).getPeso())
                .peso_anterior(pesos.get(pesos.size() - 2).getPeso())
                .peso_inicial(pesos.get(0).getPeso())
                .peso_meta(pessoa.getMeta())
                .build();

        System.out.println("montado");
    }


}
