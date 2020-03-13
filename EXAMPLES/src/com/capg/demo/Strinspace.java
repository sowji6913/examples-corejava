package com.capg.demo;
interface I1{
	String formatString(String s);
}

public class Strinspace {

	public static void main(String[] args) {
		String str="hello";
	I1 fs=s->{
			String ss=" ";
		
		for(char c:s.toCharArray()) {
			ss=ss+c+" ";
		}
		return ss;
		};
		
		System.out.println(fs.formatString(str));		

	}

}
