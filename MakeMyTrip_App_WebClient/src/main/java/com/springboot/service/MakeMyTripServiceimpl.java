package com.springboot.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.springboot.binding.Passenger;
import com.springboot.binding.Ticket;

import reactor.core.publisher.Mono;
@Service
public class MakeMyTripServiceimpl implements MakeMyTripService 
{
	String urlString="http://localhost:8080/ticket";

	@Override
	public Mono<Ticket> getTicket(Passenger p) 
	{
		Mono<Ticket> ticket= WebClient.create()
											.put()
											.uri(urlString)
											.body(BodyInserters.fromValue(p))
											.retrieve()
											.bodyToMono(Ticket.class);
		return ticket;
	}

	@Override
	public Mono<Ticket[]> allTicket() {
		
		Mono<Ticket[]> tickets = WebClient.create()
					.get()
					.uri(urlString)
					.retrieve()
					.bodyToMono(Ticket[].class);
		return tickets;
		
	}
	
}
