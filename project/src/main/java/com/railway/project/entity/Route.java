package com.railway.project.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToMany
    Set<Train> train_id;

    @OneToMany(mappedBy = "route")
    private List<Ticket> ticket;

    public Route () {}

    public Route(String name){
        this.name = name;
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

    public Set<Train> getTrain_id() {
        return train_id;
    }

    public void setTrain_id(Set<Train> train_id) {
        this.train_id = train_id;
    }
}
