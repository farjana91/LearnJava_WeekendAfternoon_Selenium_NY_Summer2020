package oop.encapsulation;

public class Pizza {
    // Encapsulation in Java is a mechanism of wrapping the data (variables) and
    //    code acting on the data (methods) together as a single unit.
    //- In encapsulation, the variables of a class will be hidden from other classes,
    //    and can be accessed only through the methods of their current class.
    //- Therefore, it is also known as data hiding.
    //
    //To achieve encapsulation in Java −
    //    - Declare the variables of a class as private.
    //    - Provide public setter and getter methods to modify and view
    //        the variables values.

    public String pizzaName="American Pizza";
    public double pizzaPrice=50.50;

    private String pizzaType="Meat Lover";
    private String sauceType;
    private String topping;
    private char size;
    private boolean isAvailable;

    public Pizza() {
    }

    public Pizza(String pizzaName) {
        this.pizzaName = pizzaName;
        System.out.println("Love to eat "+pizzaName+" pizza");
    }

    public Pizza(String pizzaName, double pizzaPrice) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
    }

    public Pizza(String pizzaName, double pizzaPrice, String pizzaType) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
        this.pizzaType = pizzaType;  // private
        System.out.println("Love to eat "+pizzaName+" Price "+pizzaPrice+" pizza type "+pizzaType);
    }

    public Pizza(String pizzaType, String sauceType, String topping, char size) {
        this.pizzaType = pizzaType;
        this.sauceType = sauceType;
        this.topping = topping;
        this.size = size;
    }


    // Getter and Setter
    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getSauceType() {
        return sauceType;
    }

    public void setSauceType(String sauceType) {
        this.sauceType = sauceType;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


}
