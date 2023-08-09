package com.lvg.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lvg.rest.entity.Passengers;
import com.lvg.rest.exception.ResourceNotFoundException;
import com.lvg.rest.exception.ResourceNotModifiedException;
import com.lvg.rest.repository.PassengersRepository;

@Service
public class PassengersService {
	@Autowired
	PassengersRepository passengersRepository;
	
	@Transactional(readOnly=true)
	public 	List<Passengers> getAllPassengers()
	{
		return passengersRepository.findAll();
	}

	@Transactional(readOnly=true)
	public 	Passengers getPassengersByPassengersId(int passengerId)
	{
		Optional<Passengers> p = passengersRepository.findById(passengerId);
	    if(p.isPresent())
	    	return p.get();
	    return null;
	    
	}
	
	@Transactional
	public void	insertorModify(Passengers passengers)
	{
	   if(passengersRepository.save(passengers) ==null)
		throw new ResourceNotModifiedException();
	}
	
	@Transactional
	public boolean	deletePassengersByPassengerId(int passengerId)
	{
		long count = passengersRepository.count();
		 passengersRepository.deleteById(passengerId);
		 if( count> passengersRepository.count())
			  return true;
		  throw new ResourceNotFoundException();
	}

}
