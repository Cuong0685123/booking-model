package com.tc.booking.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "customer")
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100)
    private String name;

    @Column(length = 15)
    private String phone;

    @Column(length = 100)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private Account account;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Booking> bookings;

    // Constructors
    public Customer() { super(); }

    public Customer(int id, String name, String phone, String email, Account account, List<Booking> bookings) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.account = account;
        this.bookings = bookings;
    }
}
