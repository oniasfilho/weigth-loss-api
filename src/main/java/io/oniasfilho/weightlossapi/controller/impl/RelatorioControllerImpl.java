package io.oniasfilho.weightlossapi.controller.impl;

import io.oniasfilho.weightlossapi.controller.RelatorioController;
import io.oniasfilho.weightlossapi.dto.RelatorioDTO;
import io.oniasfilho.weightlossapi.dto.RelatorioReqDTO;
import io.oniasfilho.weightlossapi.dto.RelatorioRespDTO;
import io.oniasfilho.weightlossapi.service.RelatorioService;
import org.springframework.web.bind.annotation.*;

@RestController
public class RelatorioControllerImpl implements RelatorioController {

    RelatorioService service;

    public RelatorioControllerImpl(RelatorioService service) {
        this.service = service;
    }

    @GetMapping("/relatorio/{userId}")
    public RelatorioRespDTO getRelatorio(@PathVariable int userId) {
        return service.getRelatorio(userId);
    }

    @PostMapping("/relatorio")
    public void createNewRelatorio(@RequestBody RelatorioReqDTO relatorio) {
        service.createNewRelatorio(relatorio);
    }
}
