package com.techamist.babucapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "BOOKING_SERVICE")
public class Service {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SERVICE_ID")
	public Long serviceId;
	
	@Column(name = "BOOKING_ID")
	public Long bookingId;
	
	@Column(name = "SERVICE_NAME")
	public String serviceName;
	
	@Column(name = "SERVICE_DURATION")
	public String serviceDuration;
	
	@Column(name = "SERVICE_COST")
	public String serviceCost;
}
