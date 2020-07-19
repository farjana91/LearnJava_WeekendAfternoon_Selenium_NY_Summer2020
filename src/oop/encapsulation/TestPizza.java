package oop.encapsulation;

public class TestPizza {

    public static void main(String[] args) {
        Pizza ramdanePizza=new Pizza(); // using Default constructor
        String rdP=ramdanePizza.pizzaName="scicilian";
        System.out.println("Ramdane love to eat "+rdP +" Pizza");

        Pizza resmaPizza=new Pizza("chicken cutlet + green pepper"); // pass the argument
        resmaPizza.pizzaPrice=40.50;
        System.out.println(resmaPizza.pizzaPrice);

        Pizza lemLemPizza=new Pizza("Fat Pizza",60.50,"American");
        lemLemPizza.setSauceType("Hot");
        lemLemPizza.setTopping("Chicken");
        System.out.println("Sauce Type "+lemLemPizza.getSauceType()+" Topping "+lemLemPizza.getTopping());
        lemLemPizza.setAvailable(true);
        System.out.println(lemLemPizza.isAvailable());



    }
}
