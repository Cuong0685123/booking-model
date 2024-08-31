package com.tc.booking.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Entity
@Table(name = "payment")
@Getter
@Setter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private double amount;

    @Column(name = "payment_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date paymentDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking booking;

    @Column(length = 50)
    private String status;

    public Payment() {
        super();
    }

    public Payment(int id, double amount, Date paymentDate, Booking booking, String status) {
        this.id = id;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.booking = booking;
        this.status = status;
    }
}
