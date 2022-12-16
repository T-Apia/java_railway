package com.railway.project.controller;

import com.railway.project.entity.Route;
import com.railway.project.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/route")
public class RouteController {

    @Autowired
    private RouteService service;

    @GetMapping("/all")
    public ResponseEntity<List<Route>> getAllRoutes(){
        List<Route> routes = service.findAllRoutes();
        return new ResponseEntity<>(routes, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Route> getRouteById(@PathVariable("id") Long id){
        Route route = service.findRouteById(id);
        return new ResponseEntity<>(route, HttpStatus.OK);
    }

    @PostMapping("/add")
    public  ResponseEntity<Route> addRoute(@RequestBody Route route){
        Route newRoute = service.addRoute(route);
        return new ResponseEntity<>(newRoute, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public  ResponseEntity<Route> updateRoute(@RequestBody Route route){
        Route updateRoute = service.updateRoute(route);
        return new ResponseEntity<>(updateRoute, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> deleteRoute(@PathVariable("id") Long id){
        service.deleteRoute(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
