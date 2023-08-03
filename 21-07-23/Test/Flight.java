package Exam;

public class Flight {
private String id ; 
private String source ; 
private String destination ; 
private Double fare ; 
private int totalSeats ;
public Flight(String string, String string2, String string3, int i, int j, int k, String string4, String string5, String string6) {
	
}
public Flight(String id, String source, String destination, Double fare, int totalSeats) {
	super();
	this.id = id;
	this.source = source;
	this.destination = destination;
	this.fare = fare;
	this.totalSeats = totalSeats;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public Double getFare() {
	return fare;
}
public void setFare(Double fare) {
	this.fare = fare;
}
public int getTotalSeats() {
	return totalSeats;
}
public void setTotalSeats(int totalSeats) {
	this.totalSeats = totalSeats;
}
public String getArrivalTime() {
	// TODO Auto-generated method stub
	return null;
}
public String getAvailableSeats() {
	// TODO Auto-generated method stub
	return null;
}
public String getDestiantion() {
	// TODO Auto-generated method stub
	return null;
} 


}
