package basic;

public class LearnNestedClass {
	
	// Parent Class
	
	
	public static void main(String[] args) {
		//Car myCar=new Car();
		System.out.println("My Car Price is "+Car.carPrice); // 50000
		Car.carPrice=60000;// re-Assign
		System.out.println("My Car Price is "+Car.carPrice); // 60000
		
		//LearnNestedClass.UseCasting obj=new LearnNestedClass.UseCasting();
		
		
	}
	
	

	public static class Car{
		// NestedClass: child class
		
		static int carPrice=50000;
		
		
		
	}
	
	
	public static  class UseCasting{
		
		static double price=5000.500;
		
		int newPrice=(int) price;
		
		int fee=(int) 400.65f;
		
		float a = (float) 67.6;
		
		
		
	}
	
	
	
	
	
	

}
