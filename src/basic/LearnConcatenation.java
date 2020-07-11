package basic;

public class LearnConcatenation {

	// Concat-e-nation
	
	static String firstName="James"; // static variable
	static String lastName="Williams";
	static String studentID="3021NY";
	
	static String fullName=firstName+" "+lastName; // + is called Concat-e-nation
	
	String stName="Syed Raza"; // non static variable
	
	public static void main(String[] args) {
		
		System.out.println("My Full Name is : "+LearnConcatenation.fullName); // String + variable // call by class name
		int num1=5;
		int num2= 7;
		int sum= num1+num2;
		System.out.println("Summation is "+sum);// String + variable
		System.out.println("Student ID with First Name :"+studentID+"_"+firstName);
		
		
		// Need to create object
		LearnConcatenation name=new LearnConcatenation();
		System.out.println("Student Name is "+name.stName); // call by object name
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
