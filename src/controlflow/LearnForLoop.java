package controlflow;

import java.util.Scanner;

public class LearnForLoop {
    // Loop is allowing us to Execute a statement or group of statements multiple times.
    // For Loop
    // While Loop
    // Do..While loop
    // For Each Loop


    public static void main(String[] args) {
        // For Loop
        //  for(initialization; condition; Iteration){}
        // initialization means startPoint
        // Condition
        // Iteration: Increment or Decrement

        for(int i=3;   i<5;    i++){
            System.out.println("Hello World"+i);
        }


        for (int i=0; i<=4;i++){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter Food Serial Number");
            int fs=input.nextInt();
            LearnSwitchCase lsc=new LearnSwitchCase();
            lsc.foodMenu(fs);
        }

        System.out.println("**********************************");
        // Nested For loop

        for (int i=0; i<5; i++){
            // Parent For loop
            System.out.println(" Parent for loop");
            // Nested for loop:
            for (int j=1;j<3;j++){
                System.out.println("Nested For Loop");
            }
        }

        for (int i = 0; i < 10; i = i + 3) {
            System.out.println("Hello World" + i);
        }

        for (int i = 0; i < 10; i += 3) { //  0+3=3   3+3 6+3
            System.out.println("Hello World" + i);
        }

    }


}
