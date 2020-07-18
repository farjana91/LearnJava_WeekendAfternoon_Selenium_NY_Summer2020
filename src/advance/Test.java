package advance;

public class Test {


    public static void main(String[] args) {
        LearnSingleton pizza=LearnSingleton.getInstance();
        pizza.pizzaName="American Pizza";
        pizza.pizzaDeliveryCharge="5";
        String deliveryCharge=pizza.pizzaDeliveryCharge="6";
        System.out.println(deliveryCharge);


        pizza.setSize('M'); // initialize value in size variable by calling setSize() method
        pizza.getSize(); // Get value from size variable by calling getSize() method
        System.out.println("Pizza size is "+pizza.getSize());



    }


}
