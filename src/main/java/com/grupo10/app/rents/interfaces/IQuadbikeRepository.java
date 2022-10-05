/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.grupo10.app.rents.interfaces;

import com.grupo10.app.rents.entities.Quadbike;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

/**
 *
 * @author Andres
 */
public interface IQuadbikeRepository extends CrudRepository<Quadbike, Integer> {
 
    @Query("SELECT c.year, COUNT(c.year) from Quadbike AS c group by c.year order by COUNT(c.year) DESC")
    public List<Object[]> countTotalQuadbikeByYear();
}
