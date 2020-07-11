package method;

public class LearnMethod {
    // Method: block of code which runs when it is called. Method is used to perform
    // certain actions and they are known as function
    // Method Type:
    // Return Method
    // Non Return Method
    // Return Method without Parameter:
    // Return Method with Parameter:
    // Non Return Method without Parameter:
    // Non Return Method with Parameter:

    // Method Syntax: AccessModifier ReturnType/MethodType MethodName(){ Method Body
    // }
    // ReturnType/MethodType : Data Type/Class Type/ Object
    // MethodName: verb+Noun

    // Return type method without Parameter:
    public int doSummation() {
        int number1 = 20;
        int number2 = 30;
        int sum = number1 + number2;
        System.out.println("Summation value is " + sum);
        return sum;
    }

    // Return type method with Parameter: Dynamic
    public int doSubtraction(int num1, int num2) {
        int number1 = num1;
        int number2 = num2;
        int sub = number2 - number1;
//        System.out.println("Subtraction Value is " + sub);
        return sub;
    }

    public String stInfo(String fName, String lName, int age){
       String fullName=fName+" "+lName;
        System.out.println("Full Name : "+fullName+ "Age "+age);
       return fullName;
    }


    // Non Return Method without Parameter:
    public void doMultiply(){
        int number1 = 20;
        int number2 = 30;
        int multiply = number1 * number2;
        System.out.println("multiply value is " + multiply);
    }

    // Non Return Method with Parameter:
    public void doMultiply(int number1,int number2){
        int multiply = number1 * number2;
        System.out.println("multiply value is " + multiply);
    }


    public void doDivision(double num1, double num2){
        double division=num2/num1;
        System.out.println("Division value is "+division);
    }

    public static void main(String[] args) {
        LearnMethod obj = new LearnMethod();
        obj.doSummation();
        obj.doSubtraction(30, 200);
        obj.doSubtraction(20, 400);
        obj.stInfo("James","William",24);
        obj.doMultiply();
        obj.doMultiply(40,10);
        obj.doDivision(30,600);

        System.out.println("*************************");

        int subt= obj.doSubtraction(40,50);
        int total=subt+50;
        System.out.println("Total value is "+total);



    }

    // return type method in java


}
