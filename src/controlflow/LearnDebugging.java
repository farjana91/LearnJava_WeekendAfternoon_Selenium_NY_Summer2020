package controlflow;

public class LearnDebugging {
    // Debug: bug
    // To identify the logical error in our code
    // Break Point

    public int doMultiply(int number1,int number2){
        int multiply = number1 * number2;
        System.out.println("multiply value is " + multiply);
        return multiply;
    }

    public static void main(String[] args) {
        LearnDebugging debug=new LearnDebugging();
        // Expected Result 200
        int expectedResult=400;
        // Actual Result 30
        int actualResult= debug.doMultiply(30,20);

        // Unit Testing: i am checking my method is working or not.
        if (expectedResult==actualResult){
            System.out.println("Test Case Pass");
        } else{
            System.out.println("Test Case Fail");
        }

        // Logical Error: To fix our logical error we need to do debugging



    }




}
