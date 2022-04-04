package com.train.TrainController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.train.Entity.Train;
import com.train.ServiceInterface.TrainServiceImpl;

@RestController
public class TrainController 
{
	@Autowired
	TrainServiceImpl trainImpl;
	@PostMapping("/post")
	public Train save(@RequestBody Train train)
	{
		return trainImpl.save(train);
		
	}
}
