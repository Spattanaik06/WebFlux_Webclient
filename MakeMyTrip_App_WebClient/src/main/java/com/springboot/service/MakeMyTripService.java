package com.springboot.service;

import com.springboot.binding.Passenger;
import com.springboot.binding.Ticket;

import reactor.core.publisher.Mono;

public interface MakeMyTripService 
{
	public Mono<Ticket> getTicket(Passenger p);
	public Mono<Ticket[]> allTicket();
}
