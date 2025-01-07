package com.schoolmgmt.school.repository;

import com.schoolmgmt.school.entity.BookingTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookingTicketRepo extends JpaRepository<BookingTicket, Long > {


}
