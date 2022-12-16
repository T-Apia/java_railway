package com.railway.project.repository;

import com.railway.project.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route, Long> {

    void deleteRouteById(Long id);

    Route findRouteById(Long id);
}
