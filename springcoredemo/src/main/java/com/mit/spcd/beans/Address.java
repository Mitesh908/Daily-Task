package com.mit.spcd.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component //indicates that this is a bean class whose xml configuration is not required
//@Service ,@Repositry, @Controller are same as @Component
public class Address
{
	private String hno="1-2-3";
	private String streetName="mg street";
	private String city="hyderbad";
	private String state="telangana";
	
	public Address() {}
	
	public Address(String hno, String streetName,String city,String state)
	{
		this.hno=hno;
		this.streetName=streetName;
		this.city=city;
		this.state=state;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
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
