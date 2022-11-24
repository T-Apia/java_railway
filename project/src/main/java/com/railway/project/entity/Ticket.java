package com.railway.project.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "ticket")
    private Passenger passenger;

    @ManyToOne()
    @JoinColumn(name = "route_id")
    private Route route;

    private java.sql.Date departure;

    public Ticket() {}

    public Ticket(Passenger passenger, Route route, java.sql.Date departure) {
        this.passenger = passenger;
        this.route = route;
        this.departure = departure;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPassenger(Passenger passenger) {

        this.passenger = passenger;
    }
    public Passenger getPassenger() {

        return passenger;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
    public Route getRoute() {
        return route;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }
    public Date getDeparture() {
        return departure;
    }

}
