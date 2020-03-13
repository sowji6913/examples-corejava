
public class OopsDEMO {
public static void main(String args[]) {
	Car duster=new Car(2345, "red", 3);
	Car alto =  new Car(10500,"blue" ,4);
	Car show=new Car(1234, "white", 0);
	duster.brake();
	duster.acclerate();
	show.showCarInfo();
	alto.showCarInfo();
	duster.showCarInfo();                                                                                                                                                                                                                    
	
	
}
}
class Car{
	int regno=10115;
	String color="blue";
	int noOfwheels=4;
	public Car(int reg,String col,int n) {
		regno=reg;
		color=col;
		noOfwheels=n;
	}
	public void acclerate() {
		System.out.println("running....");
		
	}
	
	public void brake() {
		System.out.println("stopping....");
		
	}
	public void start() {
		System.out.println("engine started");
	}


public void showCarInfo() {
	System.out.println("Reg no ="+regno);
	System.out.println("Color="+color);
	System.out.println("no of wheels ="+noOfwheels);
}
}

	


