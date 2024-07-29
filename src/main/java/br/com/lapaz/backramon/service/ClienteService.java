package br.com.lapaz.backramon.service;

import br.com.lapaz.backramon.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.lapaz.backramon.repository.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;


    public List<Cliente> getClientes() {
        return repository.findAll();
    }

    public Cliente insertCliente(Cliente cliente) {
        return repository.save(cliente);
    }
}