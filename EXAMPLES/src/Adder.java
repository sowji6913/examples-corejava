import java.util.Scanner;
public class Adder {
	public int add(int a,int b) {
		return a+b;
		
	}
	public float add(float a,float b) {
		return a+b;
		
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public int add(double a,double b)
	{
		return (int)(a+b);
	}
	public float add(int a, float b) {
		return a+b;
	}
    public String add(String s,int a,int b,String c) {
    	return s+(a+b)+c;
    }
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		Adder a=new Adder();
		int sum=a.add(5, 6);
		float sum1=a.add(15.6f,20.6f);
		int sum2= a.add(10,8,9);
		double sum3= a.add(12.55,13.55);
		float sum4= a.add(15.8f,17.8f);
		String sum5=a.add("sowji", 20, 012,"akhila");
	System.out.println(sum);
	System.out.println(sum1);
	System.out.println(sum2);
	System.out.println(sum3);
	System.out.println(sum4);		
	System.out.println(sum5);		
			
	

}
}
