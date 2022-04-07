package com.zensar.assessment;

public class Labour extends Employee {
	
	private int hours;
	private int rate;
	
	public Labour(int id, String name, int salary, int hours, int rate){
		
		
		super(id,name,salary);
		this.hours=hours;
		this.rate=rate;
		
	}
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String toString(){
		return super.toString()+" "+hours+" "+rate;
	}
	
	public int calculateSalary(){
		return hours*rate;
	}


}
