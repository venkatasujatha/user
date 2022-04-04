package com.train.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="train1")
public class Train 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trainNo;
	private String name;
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "trainNo")
	private List<Passenger> passengers;
	public Train(int trainNo, String name, List<Passenger> passengers) {
		super();
		this.trainNo = trainNo;
		this.name = name;
		this.passengers = passengers;
	}
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	
	}
