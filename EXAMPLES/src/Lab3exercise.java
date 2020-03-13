


import java.util.Scanner;
public class Lab3exercise {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String[]names=new String[5];
		System.out.println("enter 5 names");
	for(int i=0;i<5;i++) {
		names[i]=in.next();
	}
	for(int i=0;i<5;i++) {
		for(int j=i+1;j<5;j++) {
			if(names[i].compareTo(names[j])>0){
				String temp= names[i];
				names[i]=names[j];
				names[j]=temp;
				
			}
		}
	} 
	System.out.println("after sorting");
	for(String s: names) {
		System.out.println(s);
	}
	}
}
	