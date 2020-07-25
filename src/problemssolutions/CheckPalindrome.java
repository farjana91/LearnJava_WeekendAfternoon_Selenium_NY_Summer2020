package problemssolutions;

import java.util.Scanner;

public class CheckPalindrome {
    //  If a String is reversed and it remains unchanged, that is called Palindrome.
    //  For example, MOM, DAD, MADAM are
    //  Palindrome. So write java code to check if a given String is Palindrome or not.


    public static void main(String args[]) {
        checkPalindrome();

    }

    /**
     * This method will check Palindrome
     * Author: Amir Khan
     */
    public static void checkPalindrome() {
        String str;
        String rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.nextLine();
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

    /**
     * This method should display information based on parameter
     * @param displayName
     * @param displayPrice
     * Author: Mahmud
     */
    public void display(String displayName, int displayPrice){
        System.out.println("Display information "+displayName);
    }


}
