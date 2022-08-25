package com.nicesystems.service;

import com.nicesystems.request.PassengerRequest;
import com.nicesystems.response.PassengerResponse;

public interface PassengerService {
	public String bookTicket(PassengerRequest request);

	public PassengerResponse getTicket(String pnr);

}
