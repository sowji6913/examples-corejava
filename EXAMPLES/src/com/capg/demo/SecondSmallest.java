package com.capg.demo;
import java.util.*;

public class SecondSmallest {

	public static void main(String[] args) {
		List <Integer>nums= Arrays.asList(11,23,34,49,53,6,7,8,9);
		int min=nums.get(0) ;
		
		for(Integer i:nums) {
			if(i < min) {
				min =i;
			}
			
		}
		System.out.println(min);
			Collections.sort(nums);
			System.out.println("after sorting..");
		
			for(Integer i:nums) {
				System.out.println(nums);
			}
        
	}

}
