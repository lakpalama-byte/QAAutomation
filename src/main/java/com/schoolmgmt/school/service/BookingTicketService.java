package com.schoolmgmt.school.service;

import com.schoolmgmt.school.entity.BookingTicket;
import com.schoolmgmt.school.repository.BookingTicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
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