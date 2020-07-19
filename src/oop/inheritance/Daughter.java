package oop.inheritance;

public class Daughter extends Father{
    //Hierarchical level Inheritance

    public String favoritePlace="Home";
    public String favoriteDress="sharee";
    public String favColor="Blue";
    public String favSport="soccer";

    private long daughterSSN=345678233;

    public long getDaughterSSN() {
        return daughterSSN;
    }

    public void setDaughterSSN(long daughterSSN) {
        this.daughterSSN = daughterSSN;
    }

    public Daughter() {
    }

    public Daughter(String favoritePlace) {
        this.favoritePlace = favoritePlace;
    }

    public Daughter(String favoritePlace, String favoriteDress) {
        this.favoritePlace = favoritePlace;
        this.favoriteDress = favoriteDress;
    }

    public Daughter(String favoritePlace, String favoriteDress, String favColor) {
        this.favoritePlace = favoritePlace;
        this.favoriteDress = favoriteDress;
        this.favColor = favColor;
    }

    public void paint(){
        System.out.println("Daughter love to paint");
    }
    public void occupation(){
        System.out.println("Daughter love to be a Quality Engineer");
    }
    public void hike(){
        System.out.println("Daughter love to hike");
    }
    public void takePicture(){
        System.out.println("Daughter love to take picture about nature");
    }


}
