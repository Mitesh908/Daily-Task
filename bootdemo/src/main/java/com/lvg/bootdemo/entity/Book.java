package com.lvg.bootdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	@Column(name="book_id")
	private String bookId;
	@Column(name="book_title")
	private String bookTitle;
	
	@Column(name="book_author")
	private String bookAutor;
	
	@Column(name="book_category")
	private String bookCategory;
	
	@Column(name="book_price")
	private double bookPrice;
	
	@Column(name="copies")
	private int availablecopies;
	
	public Book() {}

	public Book(String bookId, String bookTitle, String bookAutor, String bookCategory, double bookPrice,
			int availablecopies) {
	
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAutor = bookAutor;
		this.bookCategory = bookCategory;
		this.bookPrice = bookPrice;
		this.availablecopies = availablecopies;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAutor() {
		return bookAutor;
	}

	public void setBookAutor(String bookAutor) {
		this.bookAutor = bookAutor;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getAvailablecopies() {
		return availablecopies;
	}

	public void setAvailablecopies(int availablecopies) {
		this.availablecopies = availablecopies;
	}
	
}
