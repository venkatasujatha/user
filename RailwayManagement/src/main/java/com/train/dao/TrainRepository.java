package com.train.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.train.Entity.Train;
@Repository
public interface TrainRepository extends JpaRepository<Train, Integer>{

}
