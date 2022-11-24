package com.railway.project.service;

import com.railway.project.entity.Station;
import com.railway.project.repository.StationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {
    private final StationRepo stationRepo;

    @Autowired
    public StationService(StationRepo stationRepo) {
        this.stationRepo = stationRepo;
    }

    public Station addStation(Station station) {
        station.setId(station.getId());
        return (Station) stationRepo.save(station);
    }

    public List<Station> findAllStations() {
        return stationRepo.findAll();
    }

    public Station updateStation(Station station){
        return (Station) stationRepo.save(station);
    }

    public Station findStationById(Long id) {
        return stationRepo.findStationById(id); //.orElseThrow()
    }

    public void deleteStation(Long id){
        stationRepo.deleteStationById(id);
    }
}
