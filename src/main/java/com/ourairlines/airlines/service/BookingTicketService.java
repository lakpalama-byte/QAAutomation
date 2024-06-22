package com.ourairlines.airlines.service;

import com.ourairlines.airlines.entity.BookingTicket;
import com.ourairlines.airlines.repository.BookingTicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BookingTicketService {
    @Autowired
    private BookingTicketRepo bookingTicketRepo;

public Optional<BookingTicket> getBookingTicketByID (Long ticketId )     {


    return bookingTicketRepo.findById(ticketId);




}


}