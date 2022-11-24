package com.railway.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Segments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long route_id;

    private String station_from;
    private String station_to;
    private java.sql.Date duration;
    private Long distance;

    public Segments() {}
    public Segments(Long route_id, String station_from, String station_to, java.sql.Date duration, Long Distance) {

        this.route_id = route_id;
        this.station_from = station_from;
        this.station_to = station_to;
        this.duration = duration;
        this.distance = distance;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setRoute_id(Long route_id) {
        this.route_id = route_id;
    }

    public Long getRoute_id() {
        return route_id;
    }

    public void setStation_from(String station_from) {
        this.station_from = station_from;
    }

    public String getStation_from() {
        return station_from;
    }

    public void setStation_to(String station_to) {
        this.station_to = station_to;
    }

    public String getStation_to() {
        return station_to;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public Long getDistance() {
        return distance;
    }
}
