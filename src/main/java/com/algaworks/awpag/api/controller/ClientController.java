package com.algaworks.awpag.api.controller;

import com.algaworks.awpag.domain.model.Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @PersistenceContext
    private EntityManager manager;

    @GetMapping
    public List<Client> getClients(){
        return manager.createQuery("from Client", Client.class).getResultList();
    }

}
