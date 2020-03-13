import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		
	Scanner in= new Scanner(System.in);
	String s;
	System.out.println("enter a string");
	s=in.nextLine();
	StringBuffer s2= new StringBuffer(s);
	for(int i=0; i<s.length();i++)
			{
				s2.setCharAt(i,s.charAt(s.length()-i-1));
			}
	
System.out.println(s2);
}
}