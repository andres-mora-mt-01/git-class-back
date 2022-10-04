/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo10.app.rents.service;

import com.grupo10.app.rents.interfaces.IQuadbikeRepository;
import com.grupo10.app.rents.entities.Category;
import com.grupo10.app.rents.entities.Message;
import com.grupo10.app.rents.interfaces.ICategoryRepository;
import com.grupo10.app.rents.entities.Quadbike;
import com.grupo10.app.rents.interfaces.IMessageRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres
 */
@Service
public class MessageService {

    @Autowired
    IMessageRepository repository;

    @Autowired
    ICategoryRepository categoryRepository; 

    public Iterable<Message> get() {
        Iterable<Message> response = repository.findAll();
        return response;
    }

    public Message create(Message request) {

        //Optional<Category> cat = categoryRepository.findById(request.getCategory().getId());
            return repository.save(request);
        

    }
}
