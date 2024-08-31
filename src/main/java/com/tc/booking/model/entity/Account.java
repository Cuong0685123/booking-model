package com.tc.booking.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "account")
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, unique = true, nullable = false)
    private String username;

    @Column(length = 100, nullable = false)
    private String password;

    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private Customer customer;

    

    public Account() {
        super();
    }

    public Account(int id, String username, String password, Customer customer) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.customer = customer;
    }
}
