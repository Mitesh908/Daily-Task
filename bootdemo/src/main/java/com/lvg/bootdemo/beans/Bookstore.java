/*package com.lvg.bootdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bookstore {  //depedendent
	private int bookId=101;
	private String bookType="comic";
	private double price=500;	
	@Autowired
	Book book;
	public Bookstore() {}
	public Bookstore(int bookId, String bookType, double price, Book book) {
	
		this.bookId = bookId;
		this.bookType = bookType;
		this.price = price;
		this.book = book;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	 

}
*/