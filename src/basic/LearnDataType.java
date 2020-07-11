package basic;

public class LearnDataType {

	
	// Data Type:
	// Primitive Data type
	
	/**
	 * Integer
	 * byte
	 * short
	 * int
	 * long
	 * 
	 * floating Point
	 * float
	 * double
	 * 
	 * char
	 * 
	 * boolean
	 */
	
	boolean isPizzaAvaialble= true;
	boolean isAllowed=false;// 1 bit
	
	char nameStartWith='S';// 16bit
	
	byte number=127;// 8 bit 127
	short price=32767; // 16bit 32767
	int age=18; // 32bit 2147483647
	long annualBudget=980938403945L; // 64 bit
	
	byte age1=18; // 1 bit
	
	float salary=5000.500f; //32bit  7 decimal
	double courseFee=4500.20; // 64bit 16 decimal
	
	
	
	
	// Non Primitive Data type: 
	
	
	/**
	 * Strings
	 * Objects
	 * Arrays
	 */
	
	
	
	
	String name="Lem Lem";// Any value you put inside double quote is counted as string

	String phoneNumber="9294241163";
	// Arrays
	int [] numbers= {1,2,4,6};
	
	
	public static void main(String[] args) {
		
		// why object need to create? 
		//  To call the property from any class
		
		// Syntax of Object: className objectName = new ConstructorOfClass();
		
		
		
		LearnDataType obj = new LearnDataType();     //  LearnDataType()  ConstructorOfClass
		// . is used to create a relationship
		
		// call property by object name
		obj.age= 20;
		System.out.println(obj.age);
		System.out.println(obj.annualBudget);
		System.out.println(obj.name);
		
		
		
		
		// To call Any property: variable/ method
		// Create Object then call by object name
		// if you use static then you only call by class name
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
