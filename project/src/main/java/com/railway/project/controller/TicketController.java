package com.railway.project.controller;

import com.railway.project.entity.Ticket;
import com.railway.project.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin("*")
@RestController
@Transactional
@RequestMapping("/ticket")
public class TicketController {


    @Autowired
    private TicketService service;

    //   public StationController(StationController stationController) {
    //       this.stationController = stationController;
    //   }
    @CrossOrigin("*")
    @GetMapping("/all")
    public ResponseEntity<List<Ticket>> getAllTickets(){
        List<Ticket> tickets = service.findAllTickets();
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Ticket> getTicketById(@PathVariable("id") Long id){
        Ticket ticket = service.findTicketById(id);
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    }

    @PostMapping("/add")
    public  ResponseEntity<Ticket> addTicket(@RequestBody Ticket ticket){
        Ticket newTicket = service.addTicket(ticket);
        return new ResponseEntity<>(newTicket, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public  ResponseEntity<Ticket> updateTicket(@RequestBody Ticket ticket){
        Ticket updateTicket = service.updateTicket(ticket);
        return new ResponseEntity<>(updateTicket, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> deleteTicket(@PathVariable("id") Long id){
        service.deleteTicket(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
