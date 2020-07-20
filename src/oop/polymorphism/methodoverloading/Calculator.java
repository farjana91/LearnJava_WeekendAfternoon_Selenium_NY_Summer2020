package oop.polymorphism.methodoverloading;

public class Calculator {
    // Method Overloading:
    String name="james";
    String name1="William";

    public int doSummation(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("Summation value is " + sum);
        return sum;
    }

    public int doSummation(int number1, int number2, int number3) {
        int sum = number1 + number2+number3;
        System.out.println("Summation value is " + sum);
        return sum;
    }
    public int doSummation(int number1, int number2, int number3, int number4) {
        int sum = number1 + number2+number3+number4;
        System.out.println("Summation value is " + sum);
        return sum;
    }
    public int doSummation(int number1, int number2, int number3, int number4, String name) {
        int sum = number1 + number2+number3+number4;
        System.out.println("Summation value is " + sum+ "Name is "+name);
        return sum;
    }



}
