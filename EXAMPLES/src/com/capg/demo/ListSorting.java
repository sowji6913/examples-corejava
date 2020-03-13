package com.capg.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSorting {

	public static void main(String[] args) {
		String a[] = {"akhila","sowji","srinidhi","shara","chinnu"}; 
		System.out.println("before sort");
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		System.out.println("after sort");
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("after conversion");
		int l=a.length;
	
if(l%2==0) {
	for(int j=0;j<=l/2;j++) {
		System.out.println(a[j].toUpperCase());
	}
	for(int j=l/2 ;j<1;j++) {
		System.out.println(a[j].toLowerCase());
	}
}
else
{
	for(int j=0;j<(l/2)+1;j++) {
		System.out.println(a[j].toUpperCase());
	}
	for(int j=(l/2)+1 ;j<1;j++) {
		System.out.println(a[j].toLowerCase());
	}
}
}
}


