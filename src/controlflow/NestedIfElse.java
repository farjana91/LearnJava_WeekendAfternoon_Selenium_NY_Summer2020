package controlflow;

public class NestedIfElse {

    public static void main(String[] args) {

        int age = 2;
        if (age > 18) {
            System.out.println("You are Adult");
            if (age > 24) {
                System.out.println("You are Youth");
                if (age>22){
                    System.out.println("you are 22+");
                } else {
                    System.out.println("you are below 22");
                }
            } else {
                System.out.println("You are not Youth");
            }
        } else {
            System.out.println("You are not adult");
            if (age>10){
                System.out.println("You are Teenager");
            } else if (age>1){
                System.out.println("You are a baby");
            }
        }

    }
}
