package oop.inheritance;

public class Father  extends GrandFather{

    public String favouriteFood="Roasted chicken";
    public String sportsTeamSupport="England";
    public String car="BMW";

    private long fatherSSN=345678232;

    public Father() {
    }

    public Father(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public Father(String favouriteFood, String sportsTeamSupport) {
        this.favouriteFood = favouriteFood;
        this.sportsTeamSupport = sportsTeamSupport;
    }

    public Father(String favouriteFood, String sportsTeamSupport, String car) {
        this.favouriteFood = favouriteFood;
        this.sportsTeamSupport = sportsTeamSupport;
        this.car = car;
    }

    public long getFatherSSN() {
        return fatherSSN;
    }

    public void setFatherSSN(long fatherSSN) {
        this.fatherSSN = fatherSSN;
    }

    public void swim(){
        System.out.println("Father can swim");
    }
    public void workFor(){
        System.out.println("Father work for Army");
    }
    public void hobby(){
        System.out.println("Father's hobby is fishing");
    }


}
