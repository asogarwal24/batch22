package com.zensar.assessment;


public class employeeSalary {

public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Abhishek", 40000);
		System.out.println(e1.calculateSalary());

		Manager e2 = new Manager(111, "Ram", 60000, 10000);
	    System.out.println(e2.calculateSalary());
	    
	    Labour e3 = new Labour(122, "Mohan", 10000, 1, 100 );
	    System.out.println(e3.calculateSalary());
         }

}