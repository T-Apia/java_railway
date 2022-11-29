package com.railway.project.controller;

import com.railway.project.entity.Passenger;
import com.railway.project.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
    @Autowired
    private PassengerService service;


    @GetMapping("/all")
    public ResponseEntity<List<Passenger>> getAllPassengers(){
        List<Passenger> passengers = service.findAllPassengers();
        return new ResponseEntity<>(passengers, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Passenger> getPassengerById(@PathVariable("id") Long id){
        Passenger passenger = service.findPassengerById(id);
        return new ResponseEntity<>(passenger, HttpStatus.OK);
    }

    @PostMapping("/add")
    public  ResponseEntity<Passenger> addPassenger(@RequestBody Passenger passenger){
        Passenger newPassenger = service.addPassenger(passenger);
        return new ResponseEntity<>(newPassenger, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public  ResponseEntity<Passenger> updatePassenger(@RequestBody Passenger passenger){
        Passenger updatePassenger = service.updatePassenger(passenger);
        return new ResponseEntity<>(updatePassenger, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> deletePassenger(@PathVariable("id") Long id){
        service.deletePassenger(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
