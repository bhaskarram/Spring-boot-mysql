package com.example.mysql.dao;

import com.example.mysql.model.Ticket;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TicketDao extends CrudRepository<Ticket,Integer> {

}
