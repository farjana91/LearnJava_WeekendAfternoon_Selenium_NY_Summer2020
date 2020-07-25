package problemssolutions;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your string: ");
        String mute = scan.nextLine();
        Permutation permutation=new Permutation();
        permutation.stringPermutation(mute);
        //permutation.stringPermutation1();

    }


}
