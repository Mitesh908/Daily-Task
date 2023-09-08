package com.example.bookstore.bookstoremanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

import com.example.bookstore.bookstoremanagement.entity.Customers;

public interface CustomersRepository extends JpaRepository<Customers,Integer>
{
	@Procedure("customer_signup")
	void insertinto(
			@Param("cust_name") String name,
			@Param("cust_mobile") long mobile,
			@Param("email_id") String email,
			@Param("postal_code") int postal_code,
			@Param("state") String state,
			@Param("password") String password,
			@Param("createdat") LocalDate date
			);

	@Query("SELECT CASE WHEN COUNT(c) = 1 THEN true ELSE false END FROM Customers c WHERE c.email_id = :email_id AND c.password = :password")

    boolean validateLogin(

        @Param("email_id") String email,

        @Param("password") String password

    );
}
