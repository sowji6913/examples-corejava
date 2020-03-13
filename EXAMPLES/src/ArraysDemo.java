import java.util.Scanner;
public class ArraysDemo {

	public static void main(String[] args) {
		int i;
		//int[]a= {5,10,15,20,25};
		//System.out.println(a[0]);
		//System.out.println(a[1]);
		//System.out.println(a[2]);
		//System.out.println(a[3]);
		//System.out.println(a[4]);
		Scanner in=new Scanner(System.in);
		int[]a=new int[5];
		System.out.println("enter a number: ");
			for (i=0;i<5;i++) {
			
			a[i]=in.nextInt();
		}
			
		for (i=0; i<5;i++) 
		{
			for(int j=i+1;j<5;j++) {
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
			
			}
		}

			System.out.println("after sorting");
			{
			for(int k:a) {
				System.out.println(k);
			}
				
		}
		
	}
	
}
		
		
		
		
		
		
		
		
		
			
		
		

	


