package Exam;

import java.time.LocalDate;


public class Traveller extends Flight {
private String Name ; 
private Integer mobile ; 
private String email ; 
private String flightId ; 
LocalDate  date ;
public Traveller() {

	
}
//String id, String source, String destination, Double fare, int totalSeats
public Traveller(String id ,String source, String destination, Double fare, int totalSeats, String name, Integer mobile, String email, String flightId, LocalDate date) {
	//
	super(id , source, destination, fare,totalSeats);
	Name = name;
	this.mobile = mobile;
	this.email = email;
	this.flightId = flightId;
	this.date = date;
	
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Integer getMobile() {
	return mobile;
}
public void setMobile(Integer mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFlightId() {
	return flightId;
}
public void setFlightId(String flightId) {
	this.flightId = flightId;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
} 


}
