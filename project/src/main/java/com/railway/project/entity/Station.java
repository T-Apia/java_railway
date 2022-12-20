package com.railway.project.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToMany(mappedBy = "station_from", targetEntity = com.railway.project.entity.Segment.class)
    private List<Segment> segments_from;

    @OneToMany(mappedBy = "station_to", targetEntity = com.railway.project.entity.Segment.class)
    private List<Segment> segments_to;

    public Station() {}

    public Station(String name, List segments_from, List segments_to) {
        this.id = id;
        this.name = name;
        this.segments_from = segments_from;
        this.segments_to = segments_to;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Segment> getSegments_from() {
        return segments_from;
    }

    public void setSegments_from(List<Segment> segments_from) {
        this.segments_from = segments_from;
    }

    public void setSegments_to(List<Segment> segments_to) {
        this.segments_to = segments_to;
    }

    public List<Segment> getSegments_to() {
        return segments_to;
    }


}

