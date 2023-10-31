package com.samarth.mongodbapp.mongodbapp;

import org.springframework.data.annotation.Id;

public class Customer {
	@Id
	public String id;
	public String Firstname;
	public String lastname;
	public Customer () {
		
	}
	public Customer(String id, String firstname, String lastname) {
		super();
		this.id = id;
		Firstname = firstname;
		this.lastname = lastname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", Firstname=" + Firstname + ", lastname=" + lastname + "]";
	}
	

}
