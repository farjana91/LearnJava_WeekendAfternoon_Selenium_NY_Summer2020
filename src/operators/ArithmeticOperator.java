package operators;

public class ArithmeticOperator {
    // + Additive operator
    // - subtraction
    // * Multiplication
    // / Division
    // % Remainder


    public static void main(String[] args) {
        int num1=70;
        int num2=20;
        int summation=num1+num2;
        System.out.println(summation);

        int Subtraction=num1-num2;
        System.out.println(Subtraction);

        int multiply=num1*num2;
        System.out.println(multiply);

        int division=num1/num2;
        System.out.println("Multiply value is "+division);

        // 70/20 = 3   70-60=10 remain rest of the value
        int remainder=num1 % num2;
        System.out.println("remainder value is "+remainder);


        double num3=30.5;
        double num4=20;
        double remainder1=num3 % num4;
        System.out.println("remainder value is "+remainder1);




    }


}
