package com.nicesystems.response;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="TICKET_DETAILS")
public class PassengerResponse {
	@Id
	@Column(name="Ticket_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ticketId;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="PRIZE")
	private Double cost;
	
	@Column(name="J_FROM")
	private String from;
	
	@Column(name="J_TO")
	private String to;
	
	@Column(name="PNR_NO")
	private String pnr;
	
	@Column(name="J_DATE")
	private String jdate;
	
	@Column(name="NAME")
	private String name;
}
