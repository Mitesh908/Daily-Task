package com.example.bookstore.bookstoremanagement.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity

@Table(name="bucket")
public class Bucket

{

    

    

    @Id

    @GeneratedValue(strategy=GenerationType.IDENTITY)

 

    @Column(name="book_id")

    private int book_id;

    @Column(name="cust_id")

    private int customer_id;

    @Column(name="price")

    private int bookprice;

    @Column(name="quantity")

    private int quantity;

 

    public Bucket() {}

 

    public Bucket(int book_id, int customer_id, int bookprice, int quantity) {

        super();

        this.book_id = book_id;

        this.customer_id = customer_id;

        this.bookprice = bookprice;

        this.quantity = quantity;

 

    }

 

    public int getBook_id() {

        return book_id;

    }

    public void setBook_id(int book_id) {

        this.book_id = book_id;

    }

    public int getCustomer_id() {

        return customer_id;

    }

    public void setCustomer_id(int customer_id) {

        this.customer_id = customer_id;

    }

    public int getBookprice() {

        return bookprice;

    }

    public void setBookprice(int bookprice) {

        this.bookprice = bookprice;

    }

    public int getQuantity() {

        return quantity;

    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;

    }    

    
//
//    @OneToOne
//
//    @JoinColumn(name="cus_id")
//
//    private Customers customer;
//
//    
//
//    @OneToOne
//
//    @JoinColumn(name="book_id")
//
//    private Books Book;

    

    

}