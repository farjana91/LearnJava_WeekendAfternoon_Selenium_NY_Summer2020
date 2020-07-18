package exceptionhandling;

public class Calculator {

    public static void doDivision(double num1, double num2){
        double division=num1/num2;
        System.out.println("Division value is "+division);
    }

    public static void main(String[] args) throws ArithmeticException {
       // doDivision(20,0);
        //doDivision();
        Calculator.doDivision1();
    }

    public static void doDivision() {
        try{ // try these block of codes
            int num1 = 45;
            int num2 = 0;
            int div = num1 / num2;
            System.out.println("Division value of two value is " + div);
        } catch (Exception exception){ // If anything wrong you get then show it here
           //exception.printStackTrace();
            System.out.println("This is Arithmetic Exception");
        } finally { // must have to execute this block of code
            System.out.println("This is Division result");
        }
    }

    public static void doDivision1()  {
            int num1 = 45;
            int num2 = 0;
            int div = num1 / num2;
            System.out.println("Division value of two value is " + div);
    }

}
