package com.railway.project.entity;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @ManyToMany
    @JoinTable(name = "route_id",
            joinColumns = @JoinColumn(name = "train_id"),
            inverseJoinColumns = @JoinColumn(name = "route_id"))
    Set<Route> route_id;
    private Integer seats;


    public Train() {}

    public Train(String name, Set route_id, Integer seats) {
        this.name= name;
        this.route_id = route_id;
        this.seats = seats;

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

    public void setRoute_id(Set route_id) {
        this.route_id = route_id;
    }

    public Set getRoute_id() {
        return route_id;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Integer getSeats() {
        return seats;
    }
}
