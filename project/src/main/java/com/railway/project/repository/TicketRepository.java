package com.railway.project.repository;

import com.railway.project.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    void deleteTicketById(Long id);

    Ticket findTicketById(Long id);

}
