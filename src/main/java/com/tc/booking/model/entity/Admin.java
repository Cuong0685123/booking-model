package com.tc.booking.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "admin")
@Getter
@Setter
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100)
    private String name;

    @Column(length = 15)
    private String phone;

    @Column(length = 50)
    private String role;

    @OneToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private Account account;

    public Admin() {
        super();
    }

    public Admin(int id, String name, String phone, String role, Account account) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.role = role;
        this.account = account;
    }
}
