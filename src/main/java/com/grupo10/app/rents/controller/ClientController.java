/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo10.app.rents.controller;

import com.grupo10.app.rents.entities.Client;
import com.grupo10.app.rents.interfaces.IQuadbikeRepository;
import com.grupo10.app.rents.entities.Quadbike;
import com.grupo10.app.rents.interfaces.IClientRepository;
import com.grupo10.app.rents.service.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Andres
 */
@RestController
@RequestMapping("/api/Client")
public class ClientController {
    
    @Autowired
    ClientService service;
    
    @GetMapping("/all")
    public Iterable<Client> get(){
        Iterable<Client> response = service.get();        
        return response;
    }
    
    @PostMapping("/save")
    public String create(@RequestBody Client request){
        
        return service.create(request);
    }


    
    
}