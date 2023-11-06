package com.example.live.user;

import jakarta.persistence.*;

@Entity
@Table(name = "temperatures")
public class Temperature {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "reading")
    private long reading;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getReading() {
        return reading;
    }

    public void setReading(long reading) {
        this.reading = reading;
    }
}
