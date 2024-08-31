package com.tc.booking.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;


@Entity
@Table(name = "hotel")
@Getter
@Setter
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100)
    private String name;

    @Column(length = 255)
    private String address;

    private float rating;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Room> rooms;

    public Hotel() {
        super();
    }

    public Hotel(int id,
                 String name,
                 String address,
                 float rating,
                 List<Room> rooms) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.rooms = rooms;
    }
}