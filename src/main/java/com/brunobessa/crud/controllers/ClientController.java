package com.brunobessa.crud.controllers;

import com.brunobessa.crud.dto.ClientDTO;
import com.brunobessa.crud.entity.Client;
import com.brunobessa.crud.repositories.ClientRepository;
import com.brunobessa.crud.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id){
        return service.findByID(id);
    }

    @GetMapping
    public Page<ClientDTO> findAll(Pageable pageable){
        return service.findAll(pageable);
    }


}
