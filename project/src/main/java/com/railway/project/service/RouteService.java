package com.railway.project.service;

import com.railway.project.entity.Route;
import com.railway.project.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {

    private final RouteRepository routeRepository;
    @Autowired
    public  RouteService(RouteRepository routeRepository) {this.routeRepository = routeRepository;}

    public Route addRoute(Route route) {
        route.setId(route.getId());
        return (Route) routeRepository.save(route);
    }

    public List<Route> findAllRoutes() {
        return routeRepository.findAll();
    }

    public Route updateRoute(Route route){
        return (Route) routeRepository.save(route);
    }

    public Route findRouteById(Long id) {
        return routeRepository.findRouteById(id); //.orElseThrow()
    }

    public void deleteRoute(Long id){
        routeRepository.deleteRouteById(id);
    }

}
