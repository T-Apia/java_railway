package com.railway.project.service;

import com.railway.project.entity.Ticket;
import com.railway.project.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket addTicket(Ticket ticket) {
        ticket.setId(ticket.getId());
        return (Ticket) ticketRepository.save(ticket);
    }
    public List<Ticket> findAllTickets() {
        return ticketRepository.findAll();
    }

    public Ticket updateTicket(Ticket ticket){
        return (Ticket) ticketRepository.save(ticket);
    }

    public Ticket findTicketById(Long id) {
        return ticketRepository.findTicketById(id); //.orElseThrow()
    }

    public void deleteTicket(Long id){
        ticketRepository.deleteTicketById(id);
    }



}
