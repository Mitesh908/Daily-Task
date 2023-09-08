package com.example.bookstore.bookstoremanagement.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;


import com.example.bookstore.bookstoremanagement.entity.Author;
import com.example.bookstore.bookstoremanagement.entity.Books;

public interface Booksrepository extends JpaRepository<Books,Integer>
{
	

@Procedure("view_books_by_title")
List<Books> viewinto(String view_books_by_title);


@Procedure("view_books_by_Author")
List<Books> view_by_Author(int auth_id);

@Procedure("view_books_by_category")
List<Books> view_by_category(String view_books_by_category);
}







