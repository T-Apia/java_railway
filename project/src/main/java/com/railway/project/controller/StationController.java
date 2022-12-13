package com.railway.project.controller;

import com.railway.project.entity.Station;
import com.railway.project.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin("*")
@RestController
@Transactional
@RequestMapping("/station")
public class StationController {

 //   private final StationController stationController;

    @Autowired
    private StationService service;

 //   public StationController(StationController stationController) {
 //       this.stationController = stationController;
 //   }
    @CrossOrigin("*")
    @GetMapping("/all")
    public ResponseEntity<List<Station>> getAllStations(){
        List<Station> stations = service.findAllStations();
        return new ResponseEntity<>(stations, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Station> getStationById(@PathVariable("id") Long id){
        Station station = service.findStationById(id);
        return new ResponseEntity<>(station, HttpStatus.OK);
    }

    @PostMapping("/add")
    public  ResponseEntity<Station> addStation(@RequestBody Station station){
        Station newStation = service.addStation(station);
        return new ResponseEntity<>(newStation, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public  ResponseEntity<Station> updateStation(@RequestBody Station station){
        Station updateStation = service.updateStation(station);
        return new ResponseEntity<>(updateStation, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> deleteStation(@PathVariable("id") Long id){
        service.deleteStation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
