package com.capg.demo;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
class SortById implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2) {
		return e1.getId()-e2.getId();
	}
}
class SortByName implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
}
}
class SortBySalary implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2) {
		return e1.getSalary()-e2.getSalary();
	}
}
public class SortingDemo {

	public static void main(String[] args) {
	List<Integer>nums=Arrays.asList(5,2,7,10,3,1);
	Collections.sort(nums);
	for(int n: nums) {
		System.out.println(n);
	}
	List<String> names=Arrays.asList("xbc","abc","stu");
	Collections.sort(names);
	for(String s:names) {
		System.out.println(s);}
	
	}
	List<Employee>emps= new ArrayList<>();
	emps.add(new Employee(101,"Rahul",50000));
	emps.add(new Employee(102,"Aahul",60000));
	emps.add(new Employee(103,"Sahul",80000));
	
      Collections.sort(emps);
      
      for (Employee e:emps)
      {
      System.out.println(e);
	 }
}


