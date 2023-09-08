package com.example.bookstore.bookstoremanagement.controller;

import java.util.List;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.bookstoremanagement.entity.Customers;
import com.example.bookstore.bookstoremanagement.repository.CustomersRepository;
import com.example.bookstore.bookstoremanagement.service.CustomersService;

@CrossOrigin(origins= {"http://localhost:4200"})

@RequestMapping("/customer")

@RestController

public class CustomerController

{

    @Autowired

    CustomersService customerService;
    
   

    @Autowired
    CustomersRepository cr;

    @GetMapping(value="/all",produces="application/json")

     public ResponseEntity<List<Customers>> getAllCustomers()

     {

          List<Customers> t1=customerService.getAllCustomers();

          if(t1.size()!=0)

            return new ResponseEntity<List<Customers>>(t1,HttpStatus.OK);

              return new ResponseEntity<List<Customers>>(t1,HttpStatus.NOT_FOUND);

        

     }

    

//     @GetMapping(value="/{customerId}",produces="application/json")
//
//     public ResponseEntity<Customers> getcustomersById( @PathVariable int customerId)
//
//     {
//
//         Customers t= customerService.getcustomersById(customerId);
//
//        if(t!=null)
//
//            return new ResponseEntity<Customers>(t,HttpStatus.OK);
//
//        return new ResponseEntity<Customers>(t,HttpStatus.NOT_FOUND);
//
//        
//
//     }
    

     
 	
     	@PostMapping(value="/register",consumes="application/json")
    	 public void insertCustomer1(@RequestBody Customers cs) 
        {
     			cr.insertinto(cs.getCustomerName(),cs.getMobile(),cs.getEmail_id(),cs.getPostalCode(),cs.getStateName(),cs.getPassword(),LocalDate.now());
     			
    	 	   

    	 	}



     @PutMapping(value="/",consumes="application/json")

     public HttpStatus ModifyCustomer(@RequestBody Customers customer) {

         if(customerService.insertIntoCustomers(customer))

             return HttpStatus.OK;

         return HttpStatus.NOT_MODIFIED;

    }

     

     

     @DeleteMapping("/{customerId}")

     public HttpStatus deleteCustomer(@PathVariable int customerId)

     {

         if(customerService.deletBycustomerId(customerId))

             return HttpStatus.OK;

         return HttpStatus.NOT_FOUND;

     }
     @PostMapping(value="/login",consumes="application/json")

 	public boolean countOfValidCustomer(@RequestBody Customers customer) {

 		return customerService.countOfCustomers(customer.getEmail_id(),customer.getPassword());

 	}

}

 

