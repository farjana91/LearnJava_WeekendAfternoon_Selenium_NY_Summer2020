package problemssolutions;

import java.util.Scanner;

public class FindOutIncreaseAndDecreaseOrder {
    // Write a program that accepts three numbers from the user and prints "increasing"
    // if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order,
    // and "Neither increasing or decreasing order" otherwise.
    // Test Data : Input first number: 1524 Input second number: 2345 Input third number: 3321


    public static void main(String[] args) {
        //checkIncreaseDecreaseOrder();
        checkIncreaseDecreaseOrder1();
//        for (int i=0; i<3; i++){
//            checkIncreaseDecreaseOrder1();
//        }
    }


    public static void checkIncreaseDecreaseOrder() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        double x = in.nextDouble();
        System.out.print("Input second number: ");
        double y = in.nextDouble();
        System.out.print("Input third number: ");
        double z = in.nextDouble();
        if (x < y && y < z) {
            System.out.println("Increasing order");
        } else if (x > y && y > z) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
    public static void checkIncreaseDecreaseOrder1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter three number:");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        if ((num3 > num2) && (num2 > num1)) {
            System.out.println("increasing");
        } else if ((num1 > num2) && (num2 > num3)) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }

}
