import java.util.Scanner;
public class Power1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the number");
		n=sc.nextInt();
		while(n>0)
		{
			if(n%2==0) {
				n=n/2;
			}
			else
			{
				break;
			}
		}
		if(n==1)
		{
		 System.out.println("power of 2");
		 
		}
		else
		{
			System.out.println("not a power of 2");
		}

	}

}
