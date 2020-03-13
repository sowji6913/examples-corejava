
 class Person {
	    private String name;
	   private int age;
	     private double phone;
   
	public static void main(String[] args) {
		Person p1= new Person("sowji",21, 9515189);
		Person p2= new Person("akhila",29, 951518);
		Person p3= new Person("nidhi",24, 88011331);
		p1.printDetails();
		p2.printDetails();
		p3.printDetails();

	}
     	

public Person(String name, int age, double phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getPhone() {
	return phone;
}
public void setPhone(double phone) {
	this.phone = phone;
}
public void printDetails() {
	System.out.println("name is="+name);
	System.out.println("age is="+age);
	System.out.println("phone is="+phone);

}
}
