package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class laptop {
	@Id
	private int  lapid;
	 private String name;
	 private String modelno;
	 private int cost;
	 
	
	
	public int getLapid() {
		return lapid;
	}
	public void setLapid(int lapid) {
		this.lapid = lapid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModelno() {
		return modelno;
	}
	public void setModelno(String modelno) {
		this.modelno = modelno;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	/*public String toString()
	{
		return "lapid: "+this.lapid+"Name: "+this.name+"Modelno: "+modelno+"cost: "+this.cost;
	}*/
	

}
