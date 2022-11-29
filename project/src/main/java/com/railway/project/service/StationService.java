package com.railway.project.service;

import com.railway.project.entity.Station;
import com.railway.project.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {
    private final StationRepository stationRepository;

    @Autowired
    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public Station addStation(Station station) {
        station.setId(station.getId());
        return (Station) stationRepository.save(station);
    }

    public List<Station> findAllStations() {
        return stationRepository.findAll();
    }

    public Station updateStation(Station station){
        return (Station) stationRepository.save(station);
    }

    public Station findStationById(Long id) {
        return stationRepository.findStationById(id); //.orElseThrow()
    }

    public void deleteStation(Long id){
        stationRepository.deleteStationById(id);
    }
}
