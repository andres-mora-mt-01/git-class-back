/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.grupo10.app.rents.interfaces;

import com.grupo10.app.rents.entities.Quadbike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andres
 */
@Repository
public interface IQuadbikeRepository extends CrudRepository<Quadbike, Integer> {
    
}
