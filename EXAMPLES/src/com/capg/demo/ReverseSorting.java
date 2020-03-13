package com.capg.demo;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class ReverseSorting {

	public static void main(String[] args) {
		int rev;
		List<Integer>nums=Arrays.asList(123,456,341,567,789);
		List<Integer>nums1=new ArrayList<>();
		for(Integer i:nums) {
			rev=0;
			int n=i;
			while(n>0) {
				int r=n%10;
				rev=rev*10+r;
				n=n/10;
			}
			nums1.add(rev);
			}
		for(Integer i:nums1)
		{
			System.out.println(i);
		}
		Collections.sort(nums);
		System.out.println("After sorting..........");
		for(Integer i:nums1) {
			System.out.println(nums);
		}
		

	}

}
