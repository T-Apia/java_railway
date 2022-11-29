package com.railway.project.repository;

import com.railway.project.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
    void deletePassengerById(Long id);

    Passenger findPassengerById(Long id);

}
