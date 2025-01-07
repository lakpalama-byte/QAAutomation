package com.schoolmgmt.school.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
@Table(name="TICKETS")
public class BookingTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private int id;
    private int flightNumber;
    private Date bookingDate;
    private int seatNumber;
    private Long customerId;

    BookingTicket () {

    }


    public BookingTicket(int id, int flightNumber, Date bookingDate, int seatNumber, Long customerId) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.bookingDate = bookingDate;
        this.seatNumber = seatNumber;
        this.customerId = customerId;
    }

}
