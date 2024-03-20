package com.algaworks.awpag.api.controller;

import com.algaworks.awpag.domain.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @GetMapping
    public List<Client> getClients(){
        var c1 = new Client();
        c1.setId(12343L);
        c1.setName("Raimunda Kelly");
        c1.setEmail("mundinha@mail.com");
        c1.setPhone("999887755");

        var c2 = new Client();
        c2.setId(12342L);
        c2.setName("Ubiraneila Silva");
        c2.setEmail("bira@mail.com");
        c2.setPhone("999884411");

        return Arrays.asList(c1, c2);
    }

}
