import java.util.Scanner;
public class Power {

	public static int isPower(int n) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("power of 2");
		}
			else
			{
				System.out.println("not a power of 2");
			}
		return n;
		}
		
		
		

	}

