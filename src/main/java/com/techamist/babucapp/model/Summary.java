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
@Table(name = "BOOKING_SUMMARY")
public class Summary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOOKING_ID")
	public Long bookingId;
	
	@Column(name = "BUSINESS_ID")
	public Long businessId;
	
	@Column(name = "CREATED_DATE")
	public String createdDate;
	
	@Column(name = "DATE_OF_APPOINTMENT")
	public String dateOfAppointment;
	
	@Column(name = "TOTAL_COST")
	public double totalCost;
	
	@Column(name = "EMAIL_ADDRESS")
	public String email;
	
	@Column(name = "USER_TYPE")
	public String userType;
	
	@Column(name = "PAYMENT_TYPE")
	public String paymentType;
	
	@Column(name = "PAYMENT_REFERENCE")
	public String paymentRef;
	
}
