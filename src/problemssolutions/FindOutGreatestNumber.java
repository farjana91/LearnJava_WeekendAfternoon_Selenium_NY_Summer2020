package problemssolutions;

import java.util.Scanner;

public class FindOutGreatestNumber {
    // Find out the Greatest Number

    public static void main(String[] args) {
       // getGreatestNumber();
        getGreatestNumber1();
        getGreatestNumber2();

    }

    public static void getGreatestNumber() {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three set of numbers");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if (a > b && a > c) {
            System.out.println("Greater number is : " + a);
        } else if (b > c) {
            System.out.println("Greater number is : " + b);
        } else {
            System.out.println("Greater number is : " + c);
        }
    }

    public static void getGreatestNumber1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();
        if (num1 > num2)
            if (num1 > num3)
                System.out.println("The greatest: " + num1);
        if (num2 > num1)
            if (num2 > num3)
                System.out.println("The greatest: " + num2);
        if (num3 > num1)
            if (num3 > num2)
                System.out.println("The greatest: " + num3);
    }
 public static void getGreatestNumber2() {
     int x = 35;
     int y = 88;
     int z = 87;
     System.out.println("Enter three integers");

     if (x > y && x > z)
         System.out.println("First number is the largest.");
     else if (y > x && y > z)
         System.out.println("Second number is the largest.");
     else if (z > x && z > y)
         System.out.println("Third number is the largest.");
     else
         System.out.println("The numbers are not distinct.");
    }


}
