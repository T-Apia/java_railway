package com.railway.project.service;

import com.railway.project.entity.Passenger;
import com.railway.project.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class PassengerService {
    private final PassengerRepository passengerRepository;

    @Autowired
    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public Passenger addPassenger(Passenger passenger) {
        passenger.setId(Long.valueOf(UUID.randomUUID().toString()));
        return passengerRepository.save(passenger);
    }

    public List<Passenger> findAllPassengers() {
        return passengerRepository.findAll();
    }

    public Passenger updatePassenger(Passenger passenger){
        return (Passenger) passengerRepository.save(passenger);
    }

    public Passenger findPassengerById(Long id) {
        return passengerRepository.findPassengerById(id); //.orElseThrow()
    }

    public void deletePassenger(Long id){
        passengerRepository.deletePassengerById(id);
    }

}
