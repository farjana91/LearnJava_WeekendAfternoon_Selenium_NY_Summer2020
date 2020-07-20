package oop.polymorphism.methodoverriding;

public class Bmw extends FlyingCar implements NewCar {

    // Annotation: over+ ride
    @Override
    public void carStart(){
        System.out.println("BMW has start feature");
        System.out.println("I love BMW");
    }

    @Override
    public void carEngine(String engineName){
       //System.out.println("Car has Engine"+engineName);
        System.out.println("Its up to you what ever code you do inside of the body of this overridden method "+engineName);
    }
    @Override
    public void carStop(){
        System.out.println("BMW has stop feature");
    }

    @Override
    public void gps() {
        System.out.println("BMW has GPS");
    }

    @Override
    public void flyingFeature() {
        System.out.println("BMW has Flying feature");
    }

}
