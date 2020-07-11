package basic;

import java.util.Scanner;

public class LearnScanner {
	
	
	// Scanner: Scanner is a class from JDK which take input from user.
	
	
	public static void main(String[] args) {
		
		// className objectName =new constructorOfClass();
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=input.nextLine();
		System.out.println("My name is "+name);
		
		System.out.println("Enter your student ID");
		int id=input.nextInt();
		System.out.println("My student ID is "+id);
		
		System.out.println("yes Present in class");
		boolean isPresent=input.nextBoolean();
		System.out.println("student is present "+isPresent);
		
		// close scanner object
		input.close();
		
	}

}
