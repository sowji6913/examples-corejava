package com.capg.demo;
   public interface InterfaceDemo {

	default	 void run(){
		System.out.println("run the product");
	}
	
	static 	void display() {
		System.out.println("display the item");
	}
	
	abstract void show();
	

	}


