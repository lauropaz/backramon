package br.com.lapaz.backramon.controller;

import br.com.lapaz.backramon.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.lapaz.backramon.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository repository;
    @PostMapping
    public Cliente save( Cliente cliente) {
        return repository.save(cliente);
    }
}