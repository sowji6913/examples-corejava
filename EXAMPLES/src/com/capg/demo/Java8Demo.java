package com.capg.demo;
//@functional interface
interface operation {
	int operate(int a,int b);
	
}
class Calculator{
	public int calculate(int a,int b, operation op) {
	return op.operate(a, b)	;
	}
}

public class Java8Demo {

	public static void main(String[] args) {
		operation op=new operation() {
			public int operate(int a,int b) {
				return a+b;
			}
			};
	
		Calculator c=new Calculator();
		int result =c.calculate(10, 15, (a,b)->a+b);
		
		System.out.println(result);
		result=c.calculate(10, 15, (a,b)->a-b);
		System.out.println(result);		
		 int result1=c.calculate(10, 15, (a,b)->a*b);	
		System.out.println(result1);
		int result2=c.calculate(10, 15, (a,b)->a/b);	
		System.out.println(result2);
	}

}
