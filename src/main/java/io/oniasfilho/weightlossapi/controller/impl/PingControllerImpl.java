package io.oniasfilho.weightlossapi.controller.impl;

import io.oniasfilho.weightlossapi.controller.PingController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingControllerImpl implements PingController {
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

}
