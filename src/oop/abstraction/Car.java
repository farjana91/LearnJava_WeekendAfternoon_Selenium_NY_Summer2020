package oop.abstraction;

public interface Car {
    // Interface is 100% Abstract

//    start()
//    stop()
//    wheel()
//    engine()
//    acceleration()
//    steering()
//    break()

    // Declare methods
    public void startCar();
    public void stopCar();
    public void wheelCar();
    public void engineCar();
    public void accelerateCar();
    public void steeringCar();
    public void breakCar();

    // Declare and initialize value
    //String carBattery;
    public String seat="4";
    public String headlight="4";
    public boolean gasTank=true;

    public interface NewCar{

        // nested interface

    }


}
