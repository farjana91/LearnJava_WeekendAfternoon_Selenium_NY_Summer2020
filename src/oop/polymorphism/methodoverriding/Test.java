package oop.polymorphism.methodoverriding;

public class Test {

    public static void main(String[] args) {
        Bmw bmw=new Bmw();
        bmw.carStart();
        bmw.carEngine("ENG2020");
        bmw.carStop();
        bmw.carWheel();
        bmw.flyingFeature();

    }
}
