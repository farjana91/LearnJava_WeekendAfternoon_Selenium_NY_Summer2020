package oop.abstraction;

public class Test {
    public static void main(String[] args) {
        GeneralMotors gm=new GeneralMotors();
        gm.startCar();
        gm.engineCar();
        gm.accelerateCar();
        gm.breakCar();
        gm.stopCar();
        //String seatNum=gm.seat="5";
        System.out.println("Number of seat is "+gm.seat);
        gm.blindSpot();

        Tesla tesla=new Tesla();
        tesla.autoGear();
        tesla.flyingFeature();
        tesla.airbag();

        System.out.println("*******************************");
        // New concept
        GeneralMotors gm1=new GeneralMotors();

        Car lemLemCar=new GeneralMotors();
        lemLemCar.startCar();
        //lemLemCar.gps();
        // casting class to use method
        ((GeneralMotors) lemLemCar).gps();

        ModernCar raza=new GeneralMotors();
        raza.blindSpot();
        //raza.startCar();
        ((GeneralMotors) raza).stopCar();








    }

}
