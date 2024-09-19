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

    private String name;
    private String address;
    private float rating;
    private String image;

   
    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER) // Changed to EAGER
    private List<Room> rooms;
    public Hotel() { super(); }

    public Hotel(int id, String name, String address, float rating, List<Room> rooms, String image) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.rooms = rooms;
        this.image = image;
    }
}
