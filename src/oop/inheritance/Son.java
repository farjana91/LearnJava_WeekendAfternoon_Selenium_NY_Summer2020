package oop.inheritance;

public class Son extends Father {

    public String favouriteSchool="PNT";
    public String educationLevel="Bachelor in Computer science";
    public String favGame="PS4";
    public String sportLoveToPlay="Baseball";

    private long sonSSN=345678233;

    public Son() {
    }

    public Son(String favouriteSchool, String educationLevel, String favGame) {
        this.favouriteSchool = favouriteSchool;
        this.educationLevel = educationLevel;
        this.favGame = favGame;
    }

    public Son(String favouriteSchool) {
        this.favouriteSchool = favouriteSchool;
    }

    public Son(String favouriteSchool, String educationLevel) {
        this.favouriteSchool = favouriteSchool;
        this.educationLevel = educationLevel;
    }

    public long getSonSSN() {
        return sonSSN;
    }

    public void setSonSSN(long sonSSN) {
        this.sonSSN = sonSSN;
    }

    public void huntingPlaces(){
        System.out.println(" Son love to hunting");
    }
    public void travel(){
        System.out.println(" Son love to travel");
    }
    public void party(){
        System.out.println(" Son love to join party");
    }


}
