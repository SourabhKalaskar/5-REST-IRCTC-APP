package com.nicesystems.serviceImpl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicesystems.repo.PassengerRepo;
import com.nicesystems.request.PassengerRequest;
import com.nicesystems.response.PassengerResponse;
import com.nicesystems.service.PassengerService;
@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerRepo pRepo;
	@Override
	public String bookTicket(PassengerRequest request) {

		PassengerResponse passengerResponse = new PassengerResponse();
		passengerResponse.setCost(510.50);
		passengerResponse.setFrom(request.getFrom());
		passengerResponse.setJdate(request.getJdate());
		passengerResponse.setName(request.getName());
		passengerResponse.setPnr(getPNR());
		passengerResponse.setStatus("Confirmed");
		passengerResponse.setTo(request.getTo());
		
		PassengerResponse passResponse = pRepo.save(passengerResponse);
		
		if(passResponse!=null) {
			return "TICKET BOOKED SUCCESSFULLY with PNR No" +passengerResponse.getPnr()+"....!!!";
		}
		
		return "TICKET COULD NOT BOOKED....!!!";
	}
	@Override
	public PassengerResponse getTicket(String pnr) {

		PassengerResponse findByPnr = pRepo.getByPnr(pnr);
		if(findByPnr!=null) {
			return findByPnr;
		}
		return null;
	}
	
	public static String getPNR() {
		Random random = new Random();
		int nextInt = random.nextInt(1000000);
		return nextInt+"";
	}

}
