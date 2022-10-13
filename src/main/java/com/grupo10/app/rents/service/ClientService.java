/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo10.app.rents.service;

import com.grupo10.app.rents.entities.Client;
import com.grupo10.app.rents.entities.Quadbike;

import com.grupo10.app.rents.interfaces.IClientRepository;
import com.grupo10.app.rents.interfaces.IMessageRepository;
import com.grupo10.app.rents.repository.ClientRepository;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres
 */
@Service
public class ClientService {

    @Autowired
    ClientRepository repository;

    public Iterable<Client> get() {
        Iterable<Client> response = repository.getAll();
        return response;
    }

    public Client create(Client request) {

        return repository.save(request);

    }

    public Client update(Client client) {
        Client clientToUpdate = new Client();

        Optional<Client> currentClient = repository.findById(client.getIdClient());
        if (!currentClient.isEmpty()) {            
            clientToUpdate = client;
            clientToUpdate.setMessages(currentClient.get().getMessages());
            clientToUpdate.setReservations(currentClient.get().getReservations());
            clientToUpdate=repository.save(clientToUpdate);
        }
        return clientToUpdate;
    }

    public Boolean delete(Integer id) {
        repository.deleteById(id);
        Boolean deleted = true;
        return deleted;
    }
}
