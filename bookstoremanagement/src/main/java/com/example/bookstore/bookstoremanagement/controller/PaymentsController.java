package com.example.bookstore.bookstoremanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.bookstoremanagement.repository.PaymentsRepository;

@RestController
public class PaymentsController {
 @Autowired
 PaymentsRepository  paymentrepository;
 
   
}
