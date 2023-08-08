package com.lvg.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lvg.rest.entity.Train;

public interface TrainRepository extends JpaRepository<Train,Integer>
{

}
