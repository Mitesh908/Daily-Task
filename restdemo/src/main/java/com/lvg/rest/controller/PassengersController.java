package com.lvg.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lvg.rest.entity.Passengers;
import com.lvg.rest.exception.ResourceNotModifiedException;
import com.lvg.rest.service.PassengersService;

@RequestMapping("/passengers")
@RestController
public class PassengersController {
	@Autowired
	PassengersService passengersService;
	
	@GetMapping
	public ResponseEntity<List<Passengers>> getAllPasssengers()
	{
		List<Passengers> plist = passengersService.getAllPassengers();
		if(plist.size()!=0)	
	    	return new ResponseEntity<List<Passengers>>(plist,HttpStatus.OK);
		return new ResponseEntity<List<Passengers>>(plist,HttpStatus.NOT_FOUND);
	    
	}
	
	@GetMapping("/{passengerId}")
	public ResponseEntity<Passengers> getByPassengerId(@PathVariable int passengerId)
	{
		Passengers p = passengersService.getPassengersByPassengersId(passengerId);
		if(p!=null)
			return new ResponseEntity<Passengers>(p,HttpStatus.OK);
		return new ResponseEntity<Passengers>(p,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(consumes="application/json")
	public HttpStatus insertPassenger(@RequestBody Passengers passenegers)
	{
		passengersService.insertorModify(passenegers);
			return HttpStatus.OK;
		
	}

	@PutMapping(consumes="application/json")
	public HttpStatus modifyPassenger(@RequestBody Passengers passenegers)
	{
		passengersService.insertorModify(passenegers);
			return HttpStatus.OK;
	}
	@DeleteMapping(consumes="application/json")
	public HttpStatus deletePassenger(@PathVariable int passenegerId)
	{
		if(passengersService.deletePassengersByPassengerId(passenegerId))			
	     	return HttpStatus.OK;
		return HttpStatus.NOT_MODIFIED;
	}
	@ExceptionHandler(ResourceNotModifiedException.class)
	public HttpStatus notModfifiedExceptionHandler()
	{
		return HttpStatus.NOT_MODIFIED;
	}
}
