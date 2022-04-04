package com.train.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.train.Entity.Passenger;
@Repository
public interface PassenRepository extends JpaRepository<Passenger, Integer>{

}
