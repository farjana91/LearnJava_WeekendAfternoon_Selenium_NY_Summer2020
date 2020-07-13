package controlflow;

public class LearnWhileLoop {

    // While loop is used in situations where we do not know how many times loop
    // needs to be executed beforehand.
    // For loop is used where we already know about the number of times loop needs
    // to be executed. Typically for a index used in iteration.

    // While Loop: pre condition check
    // when condition is false then exit from while loop
    // while(condition){ ++ or -- }

    public static void main(String[] args) {
        int x=45;
        int y=30;

//        while (x>40){
//            System.out.println("We are learning while Loop");
//            x--;
//        }

        // Nested while Loop
        while (x>42){
            System.out.println("We are learning while Loop"+x);
            x--;
            while (y<35){
                System.out.println("Nested While loop");
                y++;
            }

        }


    }



}
