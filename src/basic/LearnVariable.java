package basic;

public class LearnVariable {

	// Variable: variable is a container which hold some value

	// Left side= Right side
	// Variable syntax: DataType variableName = variableValue

	// Declare variable: not assigned any value
	int price; // Global non static variable

	// Variable Declare and Initialize/ Assign value
	int size = 18; // = Assignment operator

	int a = 5; // global variable
	// int means integer numeric value
	// a is the name of variable
	// = means assign
	// 5 is the valueOfVariable

	int b = 6; // global variable

	// variable name start with small letter

	static int age = 24; // global variable
	String name = "Lem Lem";

	// Types of Variable:
	// Global Variable/ Instance variable : outside of the method but inside of a
	// class
	// Local variable: any variable written inside of the method is known as local
	// variable.

	// Declare and Assign
	int d = 9;
	static int c = 60;

	String name2 = "Arib"; // Global non static variable
	static String name1 = "Shakir"; // Global static variable

	public static void main(String[] args) {
		// local variable
		int e = 60;

		// Create object
		LearnVariable obj = new LearnVariable();
		obj.price = 300;
		System.out.println(obj.price);

		System.out.println(LearnVariable.age);// Good practice
		System.out.println(age); // bad practice

		// Re Assign/ re initialize value
		obj.name = "Mateen Davis";
		System.out.println(obj.name);

		System.out.println(LearnVariable.age);

		int price = 20;// Assign value // local variable
		System.out.println(price);
		price = 22;// re Assign variable value
		System.out.println(price);

		LearnVariable.c = 29; // Assign value in variable and we call variable by its class name.
		System.out.println(LearnVariable.c);
		LearnVariable.c = 30;// call by class name only because of static
		System.out.println(LearnVariable.c);
		// dot is
		System.out.println(LearnVariable.name1); // sakir
		LearnVariable.name1 = "Lem Lem"; // re assign variable value
		System.out.println(LearnVariable.name1);// Lem Lem

	}

}
