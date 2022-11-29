package com.railway.project.entity;

import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "passenger_id",insertable = false, updatable = false)
    private Passenger passenger;

    @ManyToOne()
    @JoinColumn(name = "route_id",insertable = false, updatable = false)
    private Route route;

    @ManyToOne()
    @JoinColumn(name = "user_id",insertable = false, updatable = false)
    private User user;

    private java.time.Instant departure;

    public Ticket() {}

    public Ticket(Passenger passenger, Route route, User user, java.time.Instant departure) {
        this.passenger = passenger;
        this.route = route;
        this.departure = departure;
        this.user = user;
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

    public void setDeparture(java.time.Instant departure) {
        this.departure = departure;
    }
    public java.time.Instant getDeparture() {
        return departure;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
