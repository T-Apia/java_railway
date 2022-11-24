package com.railway.project.repository;

import com.railway.project.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepo extends JpaRepository<Station, Long> {
    void deleteStationById(Long id);

    Station findStationById(Long id);
}
