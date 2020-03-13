package com.capg.demo;
import java.util.Map;
import java.util.Scanner;

public class Hellonum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=new Scanner(System.in).nextLine();
		int length=str.length();
		Map<> occs=new HashMap();
		for(char c:str.toCharArray());
		if(occs.containsKey(c)) {
			int n=(int)occs.get(c)+1;
			occs.put(c, n);
		}
		else
			occs.put(c,1);
	}


		
				
			
		
		

	}


