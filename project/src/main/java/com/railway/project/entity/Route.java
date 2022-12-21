package com.railway.project.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToMany(mappedBy = "route")
    private List<Train> trains;

    @OneToMany(mappedBy = "route")
    private List<Ticket> tickets;

    @OneToMany(mappedBy = "route")
    private List<Segment> segments;


    public Route () {}

    public Route(Long id, String name, List trains, List tickets, List segments){

        this.id = id;
        this.name = name;
        this.trains = trains;
        this.tickets = tickets;
        this.segments = segments;
    }


    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

    public List<Train> getTrains() {
        return trains;
    }
}
