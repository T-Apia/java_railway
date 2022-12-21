package com.railway.project.entity;

import javax.persistence.*;



@Entity
@Table(name= "segment")
public class Segment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne()
    @JoinColumn(name = "route_id" ,insertable = false, updatable = false)
    private Route route;

    @ManyToOne()
    @JoinColumn(name = "station_from",insertable = false, updatable = false)
    private Station station_from;
    @ManyToOne()
    @JoinColumn(name = "station_to",insertable = false, updatable = false)
    private Station station_to;
    private String duration;
    private Long distance;

    public Segment() {}
    public Segment(Long id, Route route, Station station_from, Station station_to, String duration, Long distance) {

        this.id =id;
        this.distance = distance;
        this.duration = duration;
        this.route = route;
        this.station_from = station_from;
        this.station_to = station_to;


    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public Long getDistance() {
        return distance;
    }

    public Route getRoute() {
        return route;
    }

    public Station getStation_from() {
        return station_from;
    }

    public Station getStation_to() {
        return station_to;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public void setStation_to(Station station_to) {
        this.station_to = station_to;
    }

    public void setStation_from(Station station_from) {
        this.station_from = station_from;
    }
}
