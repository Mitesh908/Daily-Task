package com.lvg.bootdemo.beans;

import org.springframework.stereotype.Component;

@Component
public class Address {
   private String hno="1-2-3";
   private String street="T street";
   private String city="Chennai";
   private String state="Tamilnadu";
   
   public Address() {}  //depenedcy

public Address(String hno, String street, String city, String state) {

	this.hno = hno;
	this.street = street;
	this.city = city;
	this.state = state;
}

public String getHno() {
	return hno;
}

public void setHno(String hno) {
	this.hno = hno;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

   


}
