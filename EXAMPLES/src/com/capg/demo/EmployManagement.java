package com.capg.demo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class EmployManagement {

	public static void main(String[] args) {
		List<Employee>emps=new ArrayList<>();
		emps.add(new Employee(101,"Rahul",50000));
		emps.add(new Employee(102,"Aahul",50000));
		emps.add(new Employee(103,"Sahul",50000));
		for(Employee emp:emps) {
			System.out.println(emp);
		}
	}

}
