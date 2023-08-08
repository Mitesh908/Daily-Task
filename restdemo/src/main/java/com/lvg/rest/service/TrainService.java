package com.lvg.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lvg.rest.entity.Train;
import com.lvg.rest.repository.TrainRepository;

@Service
public class TrainService
{

	@Autowired
	TrainRepository trainRepository;
	
	@Transactional(readOnly=true)
	public List<Train> getAllTrains()
	{
		return trainRepository.findAll();
	}
	
	@Transactional(readOnly=true)
	public Train getTrainByTrainId(int trainId)
	{
		Optional<Train> ot = trainRepository.findById(trainId);
		if(ot.isPresent())
			return ot.get();
		return null;
					
	}
}
