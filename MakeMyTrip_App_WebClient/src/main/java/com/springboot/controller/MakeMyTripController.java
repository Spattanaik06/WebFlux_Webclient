package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.binding.Passenger;
import com.springboot.binding.Ticket;
import com.springboot.service.MakeMyTripService;

import reactor.core.publisher.Mono;


@Controller
public class MakeMyTripController 
{
	@Autowired
	private MakeMyTripService makeMyTripService;
	
	
	@GetMapping("/addpassenger")
	public ModelAndView ticketBook(Model model)
	{
		ModelAndView mvnAndView=new ModelAndView();
		mvnAndView.addObject("passenger", new Passenger());
		mvnAndView.setViewName("bookTicket");
		return mvnAndView;
		
	}
	
	@PostMapping("/ticket")
	public String getTicket(@ModelAttribute Passenger p,Model model)
	{
		Mono<Ticket> ticket = makeMyTripService.getTicket(p);
		return "index";
	}
	
	@GetMapping("/allticket")
	public String getAllticket(Model model)
	{
		Ticket[] block = makeMyTripService.allTicket().block();
		model.addAttribute("tickets",block);
		return "index";
	}
}
