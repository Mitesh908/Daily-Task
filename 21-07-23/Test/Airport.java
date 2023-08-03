package Exam;

import java.util.ArrayList;

import com.address.Address;

public class Airport extends Flight {
	
	private static final ArrayList<Flight> ArrayList = null;
	Address address ; 
	ArrayList<Flight> flights ; 
	ArrayList<Traveller> travellers ;
	public Airport() {
	
	}
	public Airport(String id ,String source, String destination, Double fare, int totalSeats,Address address, ArrayList<Flight> flights, ArrayList<Traveller> travellers) {
		super(id , source, destination, fare,totalSeats);
		this.address = address;
		this.flights = flights;
		this.travellers = travellers;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ArrayList<Flight> getFlights() {
		return flights;
	}
	
	public void setFlights(ArrayList<Flight> flights) {
		this.flights = flights;
	}
	
	public ArrayList<Traveller> getTravellers() {
		return travellers;
	}
	public void setTravellers(ArrayList<Traveller> travellers) {
		this.travellers = travellers;
	} 
	public boolean addFlight(Flight flight) {
		flights.add(flight);
		System.out.println("new flight got added");
		return true ; 
	}
	
	public ArrayList<Flight> SearchFlightBySourceAndDestionation(String source , String destination){
		for(int i = 0 ; i<flights.size(); i++)
		{
			if(flights.get(i).getSource()equals(source) && (flights.get(i).getDestination().equals(destination));
			ArrayList arrayList = new ArrayList();
			arrayList.add(flights.get(i));
			System.out.println("flights are available ");
		}
		System.out.println("there is no flights available ");
		
				
		return ArrayList; 
		
		
	}
	
	public void bookTicket(String flightId , Traveller traveller) {
		
		
//		travellers.add(traveller);
//		System.out.println("Tickets have been booked");
		
		for(int i = 0 ; i<flights.size();i++) {
			if(flights.get(i).getTotalSeats()>0) {
				System.out.println("seats in the flights are available");
				
				
			}
			else if(flights.get(i).getTotalSeats()<=0) {
				System.out.println("seats are not available ");
				
			}
		}
	
	}
	
	public void getAllFlights() {
		
		for(int i =  0 ; i<flights.size();i++) {
//			System.out.println(flights.get(i));
			System.out.println(flights.get(i).getId()+"   "+ flights.get(i)+"  "+ getFare()+ ""+ getTravellers());
			
		}
		
	}
	public java.util.ArrayList<Flight> searchFlightsBySourceAndDestination(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	

}
