package com.packages;

public class Employee {

	public static void main(String[] args) {
		 Example1 emp = new Example1(259, "Ajay", "Developer", 50000, 4);

	        System.out.println("Before Promotion:");
	        System.out.println("ID: " + emp.getEmpId());
	        System.out.println("Name: " + emp.getName());
	        System.out.println("Designation: " + emp.getDesignation());
	        System.out.println("Salary: " + emp.getSalary());
	        System.out.println("Rating: " + emp.getPerformanceRating());

	        emp.promoteEmployee();

	        System.out.println("\nAfter Promotion:");
	        System.out.println("Designation: " + emp.getDesignation());
	        System.out.println("Salary: " + emp.getSalary());
	    }
	}


