package oop.inheritance;

public class GrandFather {

    // Some private and public variables and methods


    public String favouriteDish="Steak";
    public String favouriteSportsTeam="Brazil";
    public String favouriteCar="Ford";

    private long grandFatherSSN=345678231;

    public long getGrandFatherSSN() {
        return grandFatherSSN;
    }

    public void setGrandFatherSSN(long grandFatherSSN) {
        this.grandFatherSSN = grandFatherSSN;
    }

    public GrandFather(String favouriteSportsTeam, String favouriteCar) {
        this.favouriteSportsTeam = favouriteSportsTeam;
        this.favouriteCar = favouriteCar;
    }

    public GrandFather(String favouriteDish) {
        this.favouriteDish = favouriteDish;
    }

    public GrandFather() {
    }

    public void height(){
        System.out.println("Grand Father Height is 6.1 feet ");
    }
    public void weight(){
        System.out.println("Grand Father Height is 180 lbs");
    }
    public void playGame(){
        System.out.println("Grand Father can play football");
    }


}
