package com.capg.demo;
interface power{
	double findPower(double x,double y);
}

public class PowerOfXLamda {

	public static void main(String[] args) {
		double x=3;
		double y=5;
				
		
		power p=(a,b)->Math.pow(a,b);
		double result=p.findPower(x,y);
		System.out.println(result);
		

	}

}
