package oop.abstraction;

public abstract class ModernCar {
    // Abstract class is not fully Abstract

    public String modernCarName="Tesla";
    public String modernCarSuggestedPrice;

    // Declare methods
    public abstract void autoStart();
    public abstract void blindSpot();
    public abstract void preCollision();
    public abstract void heatingCooling();
    public abstract void gps();
    public abstract void backCamera();
    public abstract void autoGear();

    // Non Abstract Method
    public void display(){
        System.out.println("Modern car has Display");
    }





}
