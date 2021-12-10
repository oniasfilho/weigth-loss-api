package io.oniasfilho.weightlossapi.controller.impl;

import io.oniasfilho.weightlossapi.controller.PingController;
import io.oniasfilho.weightlossapi.model.Pessoa;
import io.oniasfilho.weightlossapi.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PingControllerImpl implements PingController {

    @Autowired
    PessoaRepository repo;

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

}
