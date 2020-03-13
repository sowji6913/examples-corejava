import java.util.Scanner;
public class StudentName {

	public static void main(String[] args) {
		float marks;
		String name;
		long phone;
		String rollno;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name");
		name= sc.nextLine();
		System.out.println("enter marks");
		marks=sc.nextFloat();
		System.out.println("enter rollno");
		rollno=sc.next();
		System.out.println("enter phone");
		phone=sc.nextLong();
		System.out.print("name:\t"+" "+marks+" "+rollno+" "+phone);
		
				
		
		
		
		
		

	}

}
