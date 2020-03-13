import java.util.Scanner;
public class InheritanceDemo {
	public static  void main(String[] args) {
		   
		B b=new B();
		A a=new A();
		b.x=25;
		b.y=2;
		b.showX();
		b.showY();
		    
	}
    
}


class A{
	int x;
	public void showX() {
		System.out.println("x= "+x);
	}
}
    class B extends A{
    	int y;
    	public void showY() {
    		System.out.println("y= "+y);
    	}
    
	
    }


	



