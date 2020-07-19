package oop.abstraction;

public class GeneralMotors  extends ModernCar implements Car{
    // Concrete class
    String gmCarModel="2021M";
    double gmCarPrice=50000.500;

    public void gmCarInfo(){
        System.out.println("General Motor car information "+gmCarModel);
    }

    public void startCar() {
        System.out.println(" General Motors car has start feature");
    }

    public void stopCar() {
        System.out.println(" General Motors car has stop feature");
    }

    public void wheelCar() {
        System.out.println(" General Motors car has Wheel");
    }

    public void engineCar() {
        System.out.println(" General Motors car has Engine");
    }

    public void accelerateCar() {
        System.out.println(" General Motors car has Accelerate feature");
    }

    public void steeringCar() {
        System.out.println(" General Motors car has steering feature");
    }

    public void breakCar() {
        System.out.println(" General Motors car has break feature");
    }
    
    public void autoStart() {
        System.out.println(" General Motors car has autoStart feature");
    }

    public void blindSpot() {
        System.out.println(" General Motors car has blindSpot feature");
    }

    public void preCollision() {
        System.out.println(" General Motors car has preCollision feature");
    }

    public void heatingCooling() {
        System.out.println(" General Motors car has heatingCooling feature");
    }

    public void gps() {
        System.out.println(" General Motors car has gps feature");
    }

    public void backCamera() {
        System.out.println(" General Motors car has backCamera feature");
    }

    public void autoGear() {
        System.out.println(" General Motors car has autoGear feature");
    }
}
