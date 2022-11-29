package com.railway.project.entity;


import javax.persistence.*;
import java.time.Instant;

@Entity
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @ManyToOne
    @JoinColumn(name = "route_id",insertable = false, updatable = false)
    private Route route;
    private Integer seats;
    private java.time.Instant departure;


    public Train() {}

    public Train(String name, Route route, Integer seats, java.time.Instant departure) {
        this.name= name;
        this.route = route;
        this.seats = seats;
        this.departure = departure;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Route getRoute() {
        return route;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Integer getSeats() {
        return seats;
    }

    public Instant getDeparture() {
        return departure;
    }

    public void setDeparture(Instant departure) {
        this.departure = departure;
    }
}


