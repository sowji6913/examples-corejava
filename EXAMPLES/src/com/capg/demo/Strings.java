package com.capg.demo;

public class Strings {

	public static void main(String[] args) {
		 String [][] arr = new String[2][];
		 arr[0] = new String[2];
		 arr[1] = new String[3];
		 int i = 85;
		 for (int j = 0; j < arr.length; j++) {
		 for (int k = 0; k < arr.length; k++) {
		 arr[j][k] = ""+i;
		 i++;
		 }
		 }
		 for(String[] a :arr) {
		 for(String b:a) {
		 System.out.print(b+" ");
		 }


	}

}
}
