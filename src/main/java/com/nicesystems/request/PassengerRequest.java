package com.nicesystems.request;

import lombok.Data;

@Data
public class PassengerRequest {
	private String name;
	private String email;
	private Long phno;
	private String from;
	private String to;
	private String jdate;
	private String trainNum;
}
