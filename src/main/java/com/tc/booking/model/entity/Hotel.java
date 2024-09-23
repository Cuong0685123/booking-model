package com.tc.booking.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
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

    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String image;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JsonManagedReference // Thêm annotation này
    private List<Room> rooms = new ArrayList<>();

    public Hotel() {
        super();
    }

    public Hotel(int id, String name, String address, float rating, List<Room> rooms, String image) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.rooms = (rooms != null) ? rooms : new ArrayList<>();
        this.image = image;
    }
}