package com.train.ServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.train.Entity.Train;
import com.train.dao.TrainRepository;

@Service
public class TrainServiceImpl implements TrainInterface
{
	@Autowired
	TrainRepository trainRepo1;
	
	@Override
	public Train save(Train train) {
		
		return trainRepo1.save(train);
	}
	

}
