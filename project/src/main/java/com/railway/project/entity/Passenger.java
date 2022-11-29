package com.railway.project.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private java.time.Instant birthday;

    @OneToMany(mappedBy = "passenger")
    private List<Ticket> tickets;

    public Passenger() {}

    public Passenger(String name, String surname, java.time.Instant birthday, List tickets) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.tickets = tickets;

    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public java.time.Instant getBirthday() {
        return birthday;
    }

    public void setBirthday(java.time.Instant birthday) {
        this.birthday = birthday;
    }

}
