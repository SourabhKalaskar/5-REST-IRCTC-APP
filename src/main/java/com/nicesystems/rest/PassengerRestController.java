package com.nicesystems.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nicesystems.request.PassengerRequest;
import com.nicesystems.response.PassengerResponse;
import com.nicesystems.service.PassengerService;

@RestController
public class PassengerRestController {

	@Autowired
	private PassengerService pService;

	@PostMapping("/bookTicket")
	public ResponseEntity<String> bookTicket(@RequestBody PassengerRequest request) {

		return new ResponseEntity<>(pService.bookTicket(request), HttpStatus.CREATED);
	}

	@GetMapping("/getTicket/{pnr}")
	public ResponseEntity<PassengerResponse> getTicket(@PathVariable String pnr){
		
		PassengerResponse ticket = pService.getTicket(pnr);
		if(ticket!=null) {
			return new ResponseEntity<>(ticket, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
