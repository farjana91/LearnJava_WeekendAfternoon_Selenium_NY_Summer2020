package oop.polymorphism.methodoverloading;

import oop.polymorphism.methodoverloading.Calculator;

public class TestCalculator {


    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.doSummation(20,10);
        calculator.doSummation(10,20,30);
        calculator.doSummation(12,13,14,15);
        calculator.doSummation(20,22,25,27,"Jony");



    }
}
