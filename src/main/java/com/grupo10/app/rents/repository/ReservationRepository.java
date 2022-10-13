/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo10.app.rents.repository;

import com.grupo10.app.rents.entities.Reservation;

import com.grupo10.app.rents.interfaces.IReservationRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andres
 */
@Repository
public class ReservationRepository {

    @Autowired
    IReservationRepository repository;

    public Iterable<Reservation> getAll() {
        return repository.findAll();
    }

    public Optional<Reservation> findById(Integer id) {
        Optional<Reservation> response = repository.findById(id);
        return response;
    }

    public Boolean existsById(Integer id) {
        return repository.existsById(id);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    public Reservation save(Reservation reservation) {
        return repository.save(reservation);
    }

    public List<Object[]> getReport() {
        return repository.countTotalclientReservation();
    }

    public List<Reservation> getReservationsPeriod(Date dateA, Date dateB) {
        return repository.findAllByStartDateAfterAndStartDateBefore(dateA, dateB);
    }
    
    public List<Reservation> getReservationsByStatus(String status){
        return repository.findAllByStatus(status);
    }
}
