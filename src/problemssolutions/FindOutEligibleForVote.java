package problemssolutions;

import java.util.Scanner;

public class FindOutEligibleForVote {
    //  Write Java program to allow the user to input his/her age.
    //  Then the program will show if the person is eligible to vote.
    //  A person who is eligible to vote must be older than or equal to 18 years old.
    //  Enter your age: 18 .You are eligible to vote.

    public static void main(String[] args) {
        //checkEligibilityForVote();
        checkEligibilityForVote1();
    }


    public static void checkEligibilityForVote() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age of person");
        int age = scan.nextInt();
        System.out.println("The age of person is  " + age);
        if (age >= 18) {
            System.out.println("You are eligible to Vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }

    public static void checkEligibilityForVote1() {
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt() == true) {
            int age = input.nextInt();
            if (age > 0) {
                if ((age >= 18))
                    System.out.println("You are Eligible to vote");
                else
                    System.out.println("You Are Not Eligible");
            } else
                System.out.println("Enter a Valid Age!!!");
        } else {
            System.out.println("Please Enter a valid Age as whole number");
        }
    }

}
