package com.example.mysql.controller;

import com.example.mysql.dao.TicketDao;
import com.example.mysql.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketDao dao;

    @PostMapping("/bookTickets")
    public String bookTicket(@RequestBody Ticket tickets){
        dao.save(tickets);
        return "Ticket booked";
    }

    @GetMapping("/getTickets")
    public Iterable<Ticket> getBooking(){
        return  dao.findAll();
    }

}
