import java.util.Scanner;
public class Exception {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter a number");
		try {
			n=Integer.parseInt(sc.nextLine());
		}
		catch(NumberFormatException ex) {
			System.out.println("Error occured");
		}
		System.out.println("completed");

	}

}
