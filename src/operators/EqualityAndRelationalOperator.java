package operators;

public class EqualityAndRelationalOperator {

    // == Equal to
    // != not Equal
    // > Grater than
    // >= Grater than Equal
    // < Less than
    // <= Less than Equal


    public static void main(String[] args) {

        int num1 = 30;
        int num2 = 40;

        // True or false
        // if condition is true then if block will execute else it will not execute
        if (num1 == num2) {
            System.out.println("num1 and num2 is Equal");
        }
        if (num1 != num2) {
            System.out.println("num1 and num2 is not Equal");
        }
        if (num1 > num2) {
            System.out.println("num1 grater than num2");
        }
        if (num1 >= num2) {
            System.out.println("num1 grater than Equal num2");
        }
        if (num1 < num2) {
            System.out.println("num1 Less than num2");
        }
        if (num1 <= num2) {
            System.out.println("num1 Less than Equal num2");
        }


    }


}
