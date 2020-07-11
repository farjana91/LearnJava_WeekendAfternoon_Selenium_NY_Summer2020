package basic;

import basic.pizza.*; // * all


public class LearnObject {
	
	// A class is a blueprint or prototype that defines the variables and the methods common to all objects of a certain kind.
	
	
	// An object is a specimen of a class
	// Software objects are often used to model real-world objects you find in everyday life
	
	
	
	String phoneBrand="Apple"; // non static global varaible
	int phonePrice=1200;
	
	
	// Method
	public void phoneDisplay() {
		System.out.println("Phone Display size is 6 inch");
	}
	
	public void phoneInfo() {
		System.out.println("Phone Brand : "+phoneBrand+" "+"price "+phonePrice);
	}
	
	// Properties/ components
	
	
	public static void main(String[] args) {
		
		// Create object
		// Object Syntax: className objectName = new constructorOfClass();
		// we can call variable and method by objectName
		
		LearnObject samsung=new LearnObject();
		
		samsung.phoneInfo(); 
		samsung.phoneBrand="Samsung";
		System.out.println("Phone Brand is "+samsung.phoneBrand);
		
		// Can we create multiple object of same class??? yes
		LearnObject lg=new LearnObject();
		lg.phoneBrand="LG";
		System.out.println("Phone Brand is "+lg.phoneBrand);
		
		
		LearnObject nokia=new LearnObject();
		//nokia.phoneBrand="Nokia";
		System.out.println("Phone Brand is "+nokia.phoneBrand);
		System.out.println(nokia.phoneBrand="Nokia");
		
		
		
		
		LearnObject myObj2=new LearnObject();
		
		
		// can we create object of another class in this main method?
		
		
		Pizza myPizza=new Pizza();
		Demo demo=new Demo();
		
		LearnDataType ldt=new LearnDataType();
		ldt.name="Raza";
		System.out.println(ldt.name);
		
		
		
		
		
	}
	
	
	

}
