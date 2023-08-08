package com.lvg.bootdemo.repository;

//import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lvg.bootdemo.entity.Book;

public interface BookRepository extends JpaRepository<Book,String>
{
	//abstract methods to use additional method
       //  Optional<Book> findByTitle(String bookTitle);
        // List<Book> findByCategory(String bookCategory);
        // List<Book> findByPrice(double bookPrice);
	Optional<Book> findByBookPrice(double bookPrice);
	

}

