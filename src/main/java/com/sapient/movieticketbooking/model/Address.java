package com.sapient.movieticketbooking.model;

import jakarta.persistence.*;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int theaterId;
	
	@Column
	private String address1;
	
	/*
	 * @Column private City address2;
	 */
	
	@Column
	private String state;
	
	@Column
	private String zip;

	public int getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/*
	 * public City getAddress2() { return address2; }
	 * 
	 * public void setAddress2(City address2) { this.address2 = address2; }
	 */

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
}
