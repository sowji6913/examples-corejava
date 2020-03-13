
public class Rectangle1 {
	int l,b;
	int area=l*b;
	int peri=2*(l+b);
	

	public static void main(String[] args) {
		Rectangle1 area =new Rectangle1(20,30);
		Rectangle1 peri= new Rectangle1(20,30);
		area.printdetails();
		
		peri.printdetails();
		
		
		
		
		

	}


	public Rectangle1(int l, int b) {
		super();
		this.l = l;
		this.b = b;
		this.area = l*b;
		this.peri = 2*(l+b);
	}


	public int getL() {
		return l;
	}


	public void setL(int l) {
		this.l = l;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}


	public int getPeri() {
		return peri;
	}


	public void setPeri(int peri) {
		this.peri = peri;
	}



public void printdetails() {
	System.out.println("area1 is="+area);
	System.out.println("peri1 is="+peri);
	
}
}
