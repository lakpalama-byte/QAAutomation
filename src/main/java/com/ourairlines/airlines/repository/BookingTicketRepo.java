package com.ourairlines.airlines.repository;

import com.ourairlines.airlines.entity.BookingTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookingTicketRepo extends JpaRepository<BookingTicket, Long > {


}
