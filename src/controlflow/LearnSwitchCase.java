package controlflow;

public class LearnSwitchCase {


    public static void main(String[] args) {
        // switch (condition){ case number: statements break}
        int foodSerial=10;
        LearnSwitchCase myFood=new LearnSwitchCase();
        myFood.foodMenu(10);
    }


    public void foodMenu(int foodSerial){
        String foodName;
        switch (foodSerial){
            case 1:
                foodName="Pizza";
                break;
            case 2:
                foodName="Burger";
                break;
            case 3:
                foodName="Burito";
                break;
            case 4:
                foodName="Biriyani";
                break;
            case 5:
                foodName="couscous";
                break;
            case 6:
                foodName="ssteak";
                break;
            case 7:
                foodName="Chicken over Rice";
                break;
            case 8:
                foodName="sushi";
                break;
            case 9:
                foodName="Showarma";
                break;
            case 10:
                String drinks="coke";
                System.out.println(drinks);
                foodName="Fried Chicken";
                int qty=3;
                if (qty==3){
                    System.out.println("You order 3");
                } else {
                    System.out.println("you order more than 3");
                }
                break;
            default:
                foodName="Invalid Food Name";
                break;
        }
        System.out.println("My Food items during break is "+foodName);
    }

}
