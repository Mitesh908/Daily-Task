package com.lvg.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lvg.rest.entity.Passengers;

public interface PassengersRepository extends JpaRepository<Passengers,Integer>
{

}
