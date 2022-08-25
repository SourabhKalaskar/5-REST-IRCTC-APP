package com.nicesystems.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nicesystems.response.PassengerResponse;

@Repository
public interface PassengerRepo extends JpaRepository<PassengerResponse, Integer> {
	
	public PassengerResponse getByPnr(String pnr);

}
