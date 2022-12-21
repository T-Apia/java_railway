package com.railway.project.controller;

import com.railway.project.entity.Train;
import com.railway.project.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin("*")
@RestController
@Transactional
@RequestMapping("/train")
public class TrainController {


    @Autowired
    private TrainService service;

    //   public TrainController(TrainController stationController) {
    //       this.stationController = stationController;
    //   }
    @CrossOrigin("*")
    @GetMapping("/all")
    public ResponseEntity<List<Train>> getAllTrains(){
        List<Train> trains = service.findAllTrains();
        return new ResponseEntity<>(trains, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Train> getTrainById(@PathVariable("id") Long id){
        Train train = service.findTrainById(id);
        return new ResponseEntity<>(train, HttpStatus.OK);
    }

    @PostMapping("/add")
    public  ResponseEntity<Train> addTrain(@RequestBody Train train){
        Train newTrain = service.addTrain(train);
        return new ResponseEntity<>(newTrain, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public  ResponseEntity<Train> updateTrain(@RequestBody Train train){
        Train updateTrain = service.updateTrain(train);
        return new ResponseEntity<>(updateTrain, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> deleteTrain(@PathVariable("id") Long id){
        service.deleteTrain(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }




}
