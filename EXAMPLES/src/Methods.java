import java.util.Scanner;
public class Methods {

	public static void main(String[] args) {
		int a,b;
        char operator;
Scanner sc=new Scanner(System.in);
System.out.println("enter a");
a= sc.nextInt();
System.out.println("enter b");
b= sc.nextInt();
System.out.println("enter operator");
  operator=sc.next().charAt(0);
  float result=0;
  switch(operator) {
  case '+':
	  result=a+b;
	  break;

 
	case '-':
		  result=a-b;
		  break;
	case '*':
		  result=a*b;
		  break;
	case '/':
		  result=a/b;
		  break;
		  default:
			  System.out.println("invalid");
	}
System.out.println("Result:" +result);
	}
	
		

	}

