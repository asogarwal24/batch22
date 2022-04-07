package com.zensar.assessment;

public class Manager extends Employee {
	
	private int incentives;
	
	public Manager(int id, String name, int salary, int incentives){
		
		
		super(id, name, salary);
		this.incentives=incentives;
		
		}
	
	public String toString(){
		return super.toString()+" "+incentives;
	}
	
	public int calculateSalary(){
		return super.calculateSalary()+incentives;
	}

}
